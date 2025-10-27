package org.example;

// 16.	Escreva um programa que pergunte ao usuário um número e após, escreva na tela a soma total de 1 até o número
// lido. Exemplo: Número lido é o 5. Resultado: 1+2+3+4+5 = 15

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val;
        int sum = 0;

        System.out.println("Informe um valor:");
        val = s.nextInt();

        for (int i = 1; i <= val; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
