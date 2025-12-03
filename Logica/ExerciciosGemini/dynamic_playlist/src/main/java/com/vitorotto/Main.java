package com.vitorotto;

import java.util.LinkedList;

import com.vitorotto.controllers.PlaylistController;
import com.vitorotto.models.SongModel;
import com.vitorotto.views.PlaylistView;

public class Main {
    public static void main(String[] args) {
        LinkedList<SongModel> playlist = new LinkedList<>();

        PlaylistController controller = new PlaylistController(playlist);

        controller.addSongFirstController("Teste 1", "00:02");
        controller.addSongFirstController("Teste 2", "00:02");
        controller.addSongFirstController("Teste 3", "00:02");
        controller.addSongFirstController("Teste 4", "00:02");

        PlaylistView view = new PlaylistView(controller);

        view.initView();
    }
}