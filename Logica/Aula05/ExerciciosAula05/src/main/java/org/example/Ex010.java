package org.example;

/*Declarar dois vetores A e B, ler números para o vetor A, em seguida armazenar no
vetor B a multiplicação de cada elemento de A multiplicado pelo seu índice +1*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tam = 2;

        int[] a = new int[tam];
        int[] b = new int[tam];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe o valor na pos " + i);
            a[i] = s.nextInt();
        }

        for (int i = 0; i < b.length; i++)
            b[i] = (a[i] * (i + 1));

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
