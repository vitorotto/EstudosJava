package com.vitorotto.controllers;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;

import com.vitorotto.models.SongModel;

public class PlaylistController {
    private LinkedList<SongModel> playlist;

    public PlaylistController(LinkedList<SongModel> playlist) {
        this.playlist = playlist;
    }

    public LinkedList<SongModel> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(LinkedList<SongModel> playlist) {
        this.playlist = playlist;
    }

    // Método para adicionar música na playlist
    public boolean addSongController(String name, String durationString) {

        try {
            playlist.addLast(new SongModel(name, convertToCorrectDuration(durationString)));
            return true;
        } catch (Exception e) {
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
