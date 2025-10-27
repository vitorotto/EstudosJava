package org.example;

// 17.	Melhore o exercício da questão anterior para aceitar somente valores maiores que zero para o número lido

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int val;
        int sum = 0;

        do {
            System.out.println("Informe um valor: ");
            val = s.nextInt();
            if (val <= 0)
                System.out.println("Insira um valor positivo!");
        } while (val <= 0);

        for (int i = 1; i <= val; i++) {
            sum += i;
        }

        System.out.println("Soma: " + sum);

    }
}
