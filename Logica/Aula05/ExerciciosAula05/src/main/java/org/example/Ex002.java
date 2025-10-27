package org.example;

// Declarar três vetores A, B e C de 10 elementos. Gerar números aleatórios para os
// vetores A e B. O vetor C deve receber a soma dos elementos do vetor A com o vetor
// B. Mostrar os três vetores

import java.util.Arrays;

public class Ex002 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
            b[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < 10; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("A: ");
        System.out.println(Arrays.toString(a));
        System.out.println("B: ");
        System.out.println(Arrays.toString(b));
        System.out.println("C: ");
        System.out.println(Arrays.toString(c));
    }
}
