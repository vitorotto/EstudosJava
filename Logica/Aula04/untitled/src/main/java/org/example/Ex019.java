package org.example;

// 19.	Escreva um programa que pergunte ao usuário quantos números ele quer digitar. Após isto, o programa deve ir
// lendo os números que o usuário digitar e armazenar a soma total dos números lidos. Após a leitura dos números,
// escrever na tela a soma calculada.

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o limite: ");
        int limite = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= limite; i++) {
            System.out.println("Digite o valor " + i);
            sum += s.nextInt();
        }

        System.out.println("Soma: " + sum);
    }
}
