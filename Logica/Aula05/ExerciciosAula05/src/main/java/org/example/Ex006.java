package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vet = new int[3];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe o valor da pos " + i);
            vet[i] = s.nextInt();
        }
        
        int maior = vet[0];
        int pos = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                pos = i;
            }
        }

        System.out.println("Vetor");
        System.out.println(Arrays.toString(vet));

        System.out.println("Maior: " + maior);
        System.out.println("Pos: " + pos);
    }
}
