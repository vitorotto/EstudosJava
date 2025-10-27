package org.example;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vet = new int[3];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe o valor na pos " + i);
            vet[i] = s.nextInt();
        }

        for (int i = (vet.length - 1); i >= 0; i--) {
            System.out.println(vet[i]);
        }
    }
}
