package com.vitorotto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GuestModel> lista01 = new ArrayList<>();

        GuestRepo repository = new GuestRepo(lista01);

        System.out.println("Adicionando Teste na lista e exibindo ela");
        repository.addGuest(new GuestModel("Teste", 12));
        repository.showGuests();

        System.out.println("\nAdicionando Teste 2 na lista e exibindo ela");
        repository.addGuest(new GuestModel(("Teste 2"), 10));
        repository.showGuests();
        
        System.out.println("\nRemovendo convidado Teste e exibindo a lista");
        repository.removeGuestByName("Teste");
        repository.showGuests();

        System.out.println("\nPesquisando convidado pela posição");
        GuestModel user0 = repository.findGuestByPosition(0);
        System.out.println(user0.toString());

        System.out.println("\nVerificando existencia de convidado Teste 2 e Juliana");
        System.out.println(repository.existingGuest("Teste 2"));
        System.out.println(repository.existingGuest("Juliana"));
    }
}