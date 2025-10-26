package org.example;

/* 10.	Escreva um programa para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
Considere que o N será sempre maior que ZERO. */

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int val;
        do {
            System.out.println("Informe um valor maior que zero");
            val = s.nextInt();
            if (val > 0)
                for (int i = 1; i <= val; i++)
                    System.out.println(i);
        } while (val <= 0);
    }
}
