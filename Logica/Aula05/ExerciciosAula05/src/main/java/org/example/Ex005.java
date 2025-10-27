package org.example;

/*Declare um vetor, gere números aleatórios para ele, em seguida realize a soma de
todos os elementos do vetor, mostre o vetor e a soma*/

import java.util.Arrays;

public class Ex005 {
    public static void main(String[] args) {
        int[] vet = new int[4];
        int sum = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 11);
            sum += vet[i];
        }

        System.out.println(Arrays.toString(vet));
        System.out.println("Soma: " + sum);
    }
}
