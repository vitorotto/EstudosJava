package com.vitorotto.controllers;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

import com.vitorotto.models.SongModel;

public class PlaylistController {
    private LinkedList<SongModel> playlist;
    private Deque<SongModel> history;

    public PlaylistController(LinkedList<SongModel> playlist) {
        this.playlist = playlist;
        this.history = new LinkedList<>();
    }

    public LinkedList<SongModel> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(LinkedList<SongModel> playlist) {
        this.playlist = playlist;
    }

    public Queue<SongModel> getHistory() {
        return history;
    }

    public void setHistory(Deque<SongModel> history) {
        this.history = history;
    }

    // Método para pegar a musica tocada, remover da lista e salvar no histórico
    public boolean getSongAndAddToHistory(SongModel song) {
        history.addLast(song);
        return true;
    }

    // Método para pegar a primeira música da lista
    public String getFisrtSongOfPlaylist() {
        if (playlist.isEmpty())
            return "As músicas terminaram";
        String songName = playlist.getFirst().getSongName();
        String songDuration = convertDurationToString(playlist.getFirst().getSongDuration());

        return String.format("%s: %s", songName, songDuration);
    }

    // Método para pegar a ultima música adicionada no histórico
    public String getLastSongOfHistory() {
        if (history.isEmpty())
            return "Nada no histórico";
        String songName = history.getLast().getSongName();
        String songDuration = convertDurationToString(history.peek().getSongDuration());

        return String.format("%s: %s", songName, songDuration);
    }

    // Método para tocar a musica anterior
    public boolean playPreviousSongController() {
        if (history.isEmpty())
            return false;
        try {
            SongModel currentSong = history.removeLast();
            playlist.addFirst(currentSong);
            long totalSecondsDuration = currentSong.getSongDuration().getSeconds();
            TimeUnit.SECONDS.sleep(totalSecondsDuration);
            return true;
        } catch (InterruptedException e) {

            System.out.println(e.getMessage());
            return false;
        }
    }

    // Método para tocar a proxima musica
    public boolean playNextSongController() {
        if (playlist.isEmpty())
            return false;
        try {
            SongModel currentSong = playlist.getFirst();
            long totalSecondsDuration = currentSong.getSongDuration().getSeconds();
            TimeUnit.SECONDS.sleep(totalSecondsDuration);
            getSongAndAddToHistory(currentSong);
            playlist.removeFirst();
            return true;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    // Método para inserir no inicio da lista
    public boolean addSongFirstController(String name, String durationString) {

        try {
            playlist.addFirst(new SongModel(name, convertToCorrectDuration(durationString)));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    // Método para inserir no final da lista
    public boolean addSongLastController(String name, String durationString) {
        try {
            playlist.addLast(new SongModel(name, convertToCorrectDuration(durationString)));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    // Método que retorna o histórico de músicas em String
    public ArrayList<String> getHistoryData() {
        try {
            ArrayList<String> songsHistory = new ArrayList<>();
            int pos = 1;
            for (SongModel song : history) {
                String songName = song.getSongName();
                String songDuration = convertDurationToString(song.getSongDuration());
                songsHistory.add(String.format("%d. Nome: %s | Duração: %s", pos, songName, songDuration));
                pos++;
            }
            return songsHistory;
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return null;
        }
    }

    // Método que retorna a lista de músicas em String
    public ArrayList<String> getPlaylistData() {

        try {
            ArrayList<String> songsList = new ArrayList<>();
            for (int i = 0; i < playlist.size(); i++) {
                String songName = playlist.get(i).getSongName();
                String songDuration = convertDurationToString(playlist.get(i).getSongDuration());
                songsList.add(String.format("%d. Nome: %s | Duração: %s", i + 1, songName, songDuration));
            }
            return songsList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Método para converter a entrada em String para formato ISO 8601 (PTnMmS)
    private Duration convertToCorrectDuration(String durationString) {

        String[] parts = durationString.split(":");
        long minutes = Long.parseLong(parts[0]);
        long seconds = Long.parseLong(parts[1]);

        String durationIso = String.format("PT%dM%dS", minutes, seconds);

        return Duration.parse(durationIso);

    }

    private String convertDurationToString(Duration songDuration) {
        long minutes = songDuration.toMinutes();
        long seconds = songDuration.minusMinutes(minutes).getSeconds();

        return String.format("%d:%d", minutes, seconds);
    }

}
