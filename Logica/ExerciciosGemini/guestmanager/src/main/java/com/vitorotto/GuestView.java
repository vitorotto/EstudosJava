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
        setOpc(validateIntInputType(s));
        if (opc == 0) {
            System.out.println("Programa encerrado");
        }
        while (opc != 0) {
            exec(opc);
            showMenu();
            System.out.println("Digite uma opção: ");
            setOpc(validateIntInputType(s));
        }
    }

    private static int validateIntInputType(Scanner s) {
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
            case 1 -> addGuestView();
            case 2 -> delGuestView();
            case 3 -> showGuestsListView();
            default -> throw new AssertionError();
        }
    }

    // Função para acessar o controller e adicionar convidado na lista
    public boolean addGuestView() {
        String guestName;
        int guestAge;

        s.nextLine(); // Limpa o buffer para evitar enter antes de preencher o nome
        System.out.println("Insira o nome do convidado: ");
        guestName = s.nextLine();

        System.out.println("Informe a idade do convidado: ");
        guestAge = validateIntInputType(s);

        s.nextLine();
        try {
            boolean addedUser = controller.addGuest(new GuestModel(guestName, guestAge));
            if (addedUser) {
                System.out.println("Convidado adicionado a lista com sucesso!");
                showGuestsListView();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Erro ao adicionar convidado: " + e.getMessage());
            return false;
        }
    }

    // Função para acessar o controller e remover convidado da lista
    public boolean delGuestView() {
        s.nextLine();
        String guestName;
        showGuestsListView();
        System.out.println("Informe o nome do convidado que deseja remover: ");
        guestName = s.next();
        s.nextLine();
        try {
            controller.removeGuestByName(guestName);
            System.out.println("Convidado " + guestName + " removido da lista com sucesso");
            showGuestsListView();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    // Função para acessar o controller e exibir a lista de convidados
    public void showGuestsListView() {
        System.out.println("Lista de Convidados: ");
        if (controller.isEmpty()) {
            System.out.println("Nenhum convidado na lista");
        } else {
            for (int i = 0; i < controller.guestsList.size(); i++) {
                String name = controller.guestsList.get(i).name;
                int age = controller.guestsList.get(i).age;
                System.out.printf("%d: %s - %d anos\n", i + 1, name, age);
            }
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
