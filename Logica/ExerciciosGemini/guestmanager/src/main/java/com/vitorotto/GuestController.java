package com.vitorotto;

import java.util.ArrayList;

public class GuestController {
    ArrayList<GuestModel> guestsList;

    public GuestController(ArrayList<GuestModel> guestsList) {
        this.guestsList = guestsList;
    }

    // Função para adicionar convidado na lista
    public boolean addGuest(GuestModel guest) {
        try {
            if (guest.age < 18) {
                throw new Exception("Menores de idade não podem entrar");
            } else {
                guestsList.add(guest);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Função para exibir os convidados
    public void showGuests() {
        for (int i = 0; i < guestsList.size(); i++) {
            GuestModel currentGuest = guestsList.get(i);
            System.out.println("Nome: " + currentGuest.getName() + ", Idade: " + currentGuest.getAge());
        }
    }

    // Função para remover convidado pelo nome
    public boolean removeGuestByName(String name) {
        try {
            boolean isRemoved = false;
            for (int i = 0; i < guestsList.size(); i++) {
                GuestModel currentGuest = guestsList.get(i);

                if (name.equals(currentGuest.getName())) {
                    guestsList.remove(i);
                    isRemoved = true;
                }
            }
            return isRemoved;
        } catch (Exception e) {
            System.out.println("Erro: " + e);
            return false;
        }
    }

    // Função para retornar convidado pela posição
    public GuestModel findGuestByPosition(int pos) {
        try {
            GuestModel data = null;
            for (int i = 0; i < guestsList.size(); i++) {
                if (i == pos) {
                    data = guestsList.get(i);
                }
            }
            return data;
        } catch (Exception e) {
            System.out.println("Erro ao procurar convidado pela posição: " + e);
            return null;
        }
    }

    // Função para verificar se o convidado já foi cadastrado com esse nome
    public boolean existingGuest(String name) {
        try {
            boolean isExisting = false;
            for (int i = 0; i < guestsList.size(); i++) {
                GuestModel currentGuest = guestsList.get(i);
                if (name.equals(currentGuest.getName())) {
                    isExisting = true;
                }
            }
            return isExisting;
        } catch (Exception e) {
            System.out.println("Erro ao verificar disponibilidade do nome: " + e);
            return false;
        }
    }
}
