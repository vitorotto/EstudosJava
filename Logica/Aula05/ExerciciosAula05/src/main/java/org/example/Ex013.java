package org.example;

/*Ler dois vetores: R de 5 elementos e S de 10 elementos. Gerar um vetor X de 15
elementos cujas 5 primeiras posições contenham os elementos de R e as 10 últimas
posições, os elementos de S. Escrever o vetor X.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[10];
        int[] x = new int[15];

        System.out.println("Adicionando os valores no vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe um valor na pos " + i);
            a[i] = s.nextInt();
        }

        System.out.println("Adicionando os valores no vetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Informe um valor na pos " + i);
            b[i] = s.nextInt();
        }

        for (int i = 0; i < (x.length - b.length); i++) {
            x[i] = a[i];
        }

        System.out.println(Arrays.toString(x));

        for (int i = a.length; i < x.length; i++) {
            x[i] = b[i - a.length];
        }

        System.out.println(Arrays.toString(x));
    }
}
