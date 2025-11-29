package com.vitorotto.models;

import java.time.Duration;

public class SongModel {
    private String songName;
    private Duration songDuration;

    public SongModel(String songName, Duration songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Duration getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(Duration songDuration) {
        this.songDuration = songDuration;
    }
}
