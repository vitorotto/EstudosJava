package org.example;

/*
* 5.	Escreva um programa para ler as notas da 1a. e 2a. avaliações de um aluno, calcular e imprimir a média (simples)
*  desse aluno. Só devem ser aceitos valores válidos durante a leitura de cada nota (notas válidas: 0.0 a 10.0).*/

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float n1 = -1;
        float n2 = -1;

        while (n1 < 0 || n1 > 10) {
            System.out.println("Informe a nota 01: ");
            n1 = s.nextFloat();
        }

        while (n2 < 0 || n2 > 10) {
            System.out.println("Informe a nota 02: ");
            n2 = s.nextFloat();
        }

        float media = (n1 + n2) / 2;
        System.out.println("Média: ".concat(Float.toString(media)));

    }
}
