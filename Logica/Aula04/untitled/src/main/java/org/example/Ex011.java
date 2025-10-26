package org.example;

// 11.	Escreva um programa que leia um número calcule e imprima a tabuada dele (1 a 10)

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int val;
        do {
            System.out.println("Informe um valor entre 1 e 10: ");
            val = s.nextInt();
        } while (val < 1 || val > 10);

        System.out.println("Tabuada do " + val + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(val * i);
        }
    }
}
