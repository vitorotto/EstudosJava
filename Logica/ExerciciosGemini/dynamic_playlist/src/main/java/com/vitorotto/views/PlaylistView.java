package com.vitorotto.views;

import java.util.ArrayList;
import java.util.Scanner;

import com.vitorotto.controllers.PlaylistController;

public class PlaylistView {
    private PlaylistController _controller;
    private int opc;
    private final Scanner _s = new Scanner(System.in);

    public PlaylistView(PlaylistController controller) {
        this._controller = controller;
    }

    public PlaylistController get_controller() {
        return _controller;
    }

    public void set_controller(PlaylistController _controller) {
        this._controller = _controller;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    // Método para inicializar a view
    public void initView() {
        showMenuView();
        System.out.println("Digite uma opção: ");
        setOpc(validateIntInput(_s));
        if (getOpc() == 0) {
            System.out.println("Programa encerrado");
        } else {
            execView(getOpc());
        }
        while (getOpc() != 0) {
            showMenuView();
            System.out.println("Digite uma opção: ");
            setOpc(validateIntInput(_s));
            if (getOpc() == 0) {
                System.out.println("Programa encerrado");
            } else {
                execView(getOpc());
            }
        }

    }

    public void showMenuView() {
        System.out.println("Menu do sistema");
        System.out.println("1. Adicionar no inicio");
        System.out.println("2. Adicionar no final");
        System.out.println("3. Exibir Playlist de músicas");
        System.out.println("4. Tocar Playlist");
    }

    public void execView(int opc) {
        switch (opc) {
            case 1 -> addSongFirstView();
            case 2 -> addSongLastView();
            case 3 -> showPlaylistView();
            case 4 -> playPlaylist();
            default -> throw new AssertionError();
        }
    }

    // Método para tocar a playlist
    public void playPlaylist() {
        while (!get_controller().getPlaylist().isEmpty()) {
            System.out.println("Tocando: " + get_controller().getPlaylist().getFirst().getSongName());
            get_controller().playNextSongController();
        }
    }

    // Método para inserir música no final da lista
    public void addSongLastView() {
        clearBuffer();
        String name = readSongNameInput(_s);
        String durationString = readSongDurationInput(_s);
        get_controller().addSongLastController(name, durationString);
    }

    // Método para exibir a lista
    public void showPlaylistView() {
        PlaylistController controller = get_controller();
        ArrayList<String> songsList = controller.getPlaylistData();

        for (String song : songsList) {
            System.out.println(song);
        }
    }

    // Método para adicionar elemento no inicio da lista
    public void addSongFirstView() {
        clearBuffer();
        String name = readSongNameInput(_s);
        String durationString = readSongDurationInput(_s);
        PlaylistController controller = get_controller();
        controller.addSongFirstController(name, durationString);
    }

    // Método para ler String
    private String readSongNameInput(Scanner s) {
        System.out.println("Informe o nome da música:");
        return s.nextLine();
    }

    // Método para limpar buffer (gambiarra)
    private void clearBuffer() {
        this._s.nextLine();
    }

    // Método para validar input de duração
    private String readSongDurationInput(Scanner s) {
        boolean isValid = false;
        String input;
        do {
            System.out.println("Informe a duração da música: (mm:ss)");
            input = s.nextLine();
            if (input.length() == 5 && input.contains(":")) {
                isValid = true;
            }
        } while (isValid == false);
        return input;
    }

    private int validateIntInput(Scanner s) {
        boolean isValid = false;
        int input = 0;

        while (!isValid) {
            if (s.hasNextInt()) {
                input = s.nextInt();
                isValid = true;
            } else {
                System.out.println("Opção inválida");
                clearBuffer();
                System.out.println("Digite um número inteiro");
            }
        }

        return input;
    }
}
