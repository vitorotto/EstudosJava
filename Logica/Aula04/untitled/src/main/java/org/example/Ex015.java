package org.example;

// Escreva um programa para ler 300 números e escrever a soma total dos 300 números lidos (usando a estrutura de repetição for).

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 300; i++) {
            System.out.println("Informe um numero: ");
            sum += s.nextInt();
        }
        System.out.println(sum);
    }
}
