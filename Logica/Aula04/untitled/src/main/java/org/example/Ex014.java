package org.example;

// 14.	Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá calcular e mostrar :
// a. A menor altura do grupo;
// b. A maior altura do grupo;
// Só é preciso armazenar a maior e a menor altura, não precisa armazenar as demais.

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float tam;
        float maior = 0;
        float menor = 3.00f;

        for (int i = 0; i < 15; i++) {
            System.out.println("Informe a altura da pessoa " + i);
            tam = s.nextFloat();

            // Encontrando a maior
            if (maior < tam)
                maior = tam;

            // Encontrando a menor
            if (menor > tam)
                menor = tam;
        }

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
    }
}
