package com.vitorotto.models;

import java.util.LinkedList;

public class PlaylistModel {
    LinkedList<SongModel> songsList;

    public PlaylistModel(LinkedList<SongModel> songsList) {
        this.songsList = songsList;
    }

    public LinkedList<SongModel> getSongsList() {
        return songsList;
    }

    public void setSongsList(LinkedList<SongModel> songsList) {
        this.songsList = songsList;
    }
}
