package org.example;

// 18.	Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes
// intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val;
        int cont0a25 = 0;
        int cont26a50 = 0;
        int cont51a75 = 0;
        int cont76a100 = 0;

        do {
            System.out.println("Informe um valor: (negativo para parar de inserir)");
            val = s.nextInt();
            if (val >= 0 && val <= 25)
                cont0a25++;
            else if (val >= 26 && val <= 50)
                cont26a50++;
            else if (val >= 51 && val <= 75)
                cont51a75++;
            else if (val >= 76 && val <= 100)
                cont76a100++;
        } while (val >= 0);

        System.out.println("0 a 25: " + cont0a25);
        System.out.println("26 a 50: " + cont26a50);
        System.out.println("51 a 75: " + cont51a75);
        System.out.println("76 a 100: " + cont76a100);
    }
}
