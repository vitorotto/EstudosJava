package com.vitorotto.controllers;

import java.util.ArrayList;

import com.vitorotto.exceptions.AgeValidationException;
import com.vitorotto.models.GuestModel;

public class GuestController {
    ArrayList<GuestModel> guestsList;

    public GuestController(ArrayList<GuestModel> guestsList) {
        this.guestsList = guestsList;
    }

    // Função para adicionar convidado na lista
    public boolean addGuest(String name, int age) {
        try {
            if (age < 18) {
                throw new AgeValidationException("Menores de idade não podem entrar");
            } else {
                guestsList.add(new GuestModel(name, age));
            }
            return true;
        } catch (AgeValidationException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    // Função para retornar a lista de convidados
    public ArrayList<GuestModel> getGuests() {
        return guestsList;
    }

    // Função para remover convidado pelo nome
    public boolean removeGuestByName(String name) {
        try {
            boolean isRemoved = guestsList.removeIf(guest -> guest.getName().equals(name));
            // Versão antiga que pode bugar
            // for (int i = 0; i < guestsList.size(); i++) {
            //     GuestModel currentGuest = guestsList.get(i);

            //     if (name.equals(currentGuest.getName())) {
            //         guestsList.remove(i);
            //         isRemoved = true;
            //     }
            // }
            return isRemoved;
        } catch (Exception e) {
            System.out.println("Erro: " + e);
            return false;
        }
    }

    // Função para retornar convidado pela posição
    public GuestModel findGuestByName(String name) {
        try {
            GuestModel data = null;
            GuestModel currentGuest;
            for (int i = 0; i < guestsList.size(); i++) {
                currentGuest = guestsList.get(i);
                if (currentGuest.getName().equals(name)) {
                    data = currentGuest;
                }
            }
            return data;
        } catch (Exception e) {
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

    // Função para atualizar o status do convidado
    public boolean updateGuestStatusByName(String name, String status) {
    try {
        GuestModel userToUpdate = findGuestByName(name);
        userToUpdate.setStatus(status);
        return true;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    }
    }

    // Função para verificar se a lista está vazia
    public boolean isEmpty() {
        return guestsList.size() <= 0;
    }
}
