package org.example;

// 13.	Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de três e que se
// encontram no conjunto dos números de 1 até 500.

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
