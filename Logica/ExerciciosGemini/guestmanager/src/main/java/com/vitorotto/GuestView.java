package com.vitorotto;

import java.util.Scanner;

public class GuestView {
    private int opc;
    private final Scanner s;
    public GuestController controller;

    public GuestView(Scanner s, GuestController controller) {
        this.s = s;
        this.controller = controller;
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
        setOpc(s.nextInt());
        while (opc != 0) {
            exec(opc);
        }
    }

    private static int validateAgeInputType(Scanner s) {
        boolean validInput = false;
        int result = 0;

        while (!validInput) {
            if (s.hasNextInt()) {
                result = s.nextInt();
                validInput = true;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                s.next();
                System.out.print("Digite um número inteiro: ");
            }
        }
        return result;
    }

    public void exec(int opc) {
        switch (opc) {
            case 0 -> {
                System.out.println("Saindo...");
            }
            case 1 -> addGuestView();
            default -> throw new AssertionError();
        }
    }

    public boolean addGuestView() {
        String guestName;
        int guestAge;

        s.nextLine(); // Limpa o buffer para evitar enter antes de preencher o nome
        System.out.println("Insira o nome do convidado: ");
        guestName = s.nextLine();

        System.out.println("Informe a idade do convidado: ");
        guestAge = validateAgeInputType(s);

        s.nextLine();
        try {
            boolean addedUser = controller.addGuest(new GuestModel(guestName, guestAge));
            if (addedUser) {
                System.out.println("Convidado adicionado a lista com sucesso!");
                controller.showGuests();
                showMenu();
                return true;
            } else {
                showMenu();
                return false;
            }
        } catch (Exception e) {
            System.out.println("Erro ao adicionar convidado: " + e);
            showMenu();
            return false;
        }
    }

    // Getters e Setters
    public void setOpc(int opc) {
        this.opc = opc;
    }

    public int getOpc() {
        return opc;
    }
}
