package controllers;

import java.util.LinkedList;

import com.vitorotto.controllers.PlaylistController;
import com.vitorotto.models.SongModel;

public class PlaylistControllerTest {
    public static void main(String[] args) {
        LinkedList<SongModel> playlist = new LinkedList<>();

        PlaylistController controller = new PlaylistController(playlist);

        controller.addSongFirstController("Teste", "03:55");
        controller.addSongFirstController("Teste1", "03:55");
        controller.addSongFirstController("Teste2", "03:55");

        controller.addSongLastController("Teste add final", "03:44");
        controller.addSongLastController("Teste add final 1", "03:44");
        controller.addSongLastController("Teste add final 2", "03:44");
        controller.addSongLastController("Teste add final 3", "03:44");

        controller.addSongFirstController("Teste3", "03:55");
        controller.addSongFirstController("Teste4", "03:55");
        controller.addSongFirstController("Teste5", "03:55");

        for (Object song : controller.getPlaylistData()) {
            System.out.println(song);
        }

    }
}