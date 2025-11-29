package com.vitorotto;

import java.util.ArrayList;
import java.util.Scanner;

import com.vitorotto.controllers.GuestController;
import com.vitorotto.models.GuestModel;
import com.vitorotto.views.GuestView;

public class Main {
    public static void main(String[] args) {
        ArrayList<GuestModel> guestsList = new ArrayList<>();
        GuestView view = new GuestView(new Scanner(System.in), new GuestController(guestsList));

        view.initView();
    }
}