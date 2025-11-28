package com.vitorotto;

import java.util.Scanner;

public class GuestView {
    private int opc;
    private Scanner s;
    public GuestController controller;
    public GuestView( Scanner s, GuestController controller) {
        this.s = s;
        this.controller = controller;
    }

    public int getOpc() {
        return opc;
    }

    public void showMenu() {
        System.out.println("/* ->> MENU DO SISTEMA <<- */");
        System.out.println("1 - Adicionar Convidado a Lista");
        System.out.println("2 - Remover Convidado da Lista");
        System.out.println("3 - Exibir a lista de convidados");
        System.out.println("4 - Atualizar o status do convidado");
        System.out.println("0 - Sair");
    }

    public void initView() {
        showMenu();
        System.out.println("Digite uma opção: ");
        this.opc = s.nextInt();
        while(opc != 0) {
            exec(opc);
        }
    }

    private boolean validateInput(int opc) {
        boolean validInput = false;

        while (!validInput) {
            // TODO
        }

        return validInput;
    }

    public void exec(int opc) {
        switch (opc) {
            case 0 -> {}
            case 1 -> addGuestView();
            default -> throw new AssertionError();
        }
    }

    public boolean  addGuestView() {
        String guestName;
        int guestAge = 0;

        s.nextLine(); // Limpa o buffer para evitar enter antes de preencher o nome
        System.out.println("Insira o nome do convidado: ");
        guestName = s.nextLine();

        boolean validInput = false;

        System.out.println("Informe a idade do convidado: ");
        while (!validInput) {
            if (s.hasNextInt()) {
                guestAge = s.nextInt();
                validInput = true;
            } else {
                // Se não for um inteiro, exibe uma mensagem de erro e descarta a entrada
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                s.next(); // Limpa o buffer do scanner
                System.out.print("Digite um número inteiro: ");
            }
        }
        s.nextLine();
        try {
            controller.addGuest(new GuestModel(guestName, guestAge));
            System.out.println("Convidado adicionado a lista com sucesso!");
            controller.showGuests();
            showMenu();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao adicionar convidado: " + e);
            showMenu();
            return false;
        }
    }
}
