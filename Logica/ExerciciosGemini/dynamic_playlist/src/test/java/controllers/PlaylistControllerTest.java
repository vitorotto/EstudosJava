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
        controller.addSongFirstController("Teste3", "03:55");
        controller.addSongFirstController("Teste4", "03:55");
        controller.addSongFirstController("Teste5", "03:55");
        System.out.println(controller.getPlaylistData());

    }
}