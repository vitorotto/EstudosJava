package com.vitorotto;

import java.util.LinkedList;

import com.vitorotto.controllers.PlaylistController;
import com.vitorotto.models.SongModel;
import com.vitorotto.views.PlaylistView;

public class Main {
    public static void main(String[] args) {
        LinkedList<SongModel> playlist = new LinkedList<>();

        PlaylistController controller = new PlaylistController(playlist);

        controller.addSongLastController("Teste 1 final", "00:02");
        controller.addSongLastController("Teste 2 final", "00:02");
        controller.addSongFirstController("Teste 1 inicio", "00:02");
        controller.addSongFirstController("Teste 2 inicio", "00:02");

        PlaylistView view = new PlaylistView(controller);

        view.initView();
    }
}