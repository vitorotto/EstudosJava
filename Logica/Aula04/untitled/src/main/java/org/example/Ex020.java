package org.example;

// 20.	Escreva um programa para ler 50 valores, calcular e escrever a média aritmética desses valores lidos.
// Atenção: Média Aritmética = somar todos e dividir pela quantidade.

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int limite = 3;

        for (int i = 1; i <= limite; i++) {
            System.out.println("Informe o valor " + i);
            sum += s.nextInt();
        }

        float media = (float) sum / limite;
        System.out.println("Média: " + media);
    }
}
