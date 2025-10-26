package org.example;

// 12.	Escreva um programa que leia um número e diga se ele é primo ou não.

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        boolean isPrimo = false;

        System.out.println("Informe um número: ");
        num = s.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            } else {
                isPrimo = true;
            }
        }

        System.out.println("Primo: " + isPrimo);
    }
}
