package org.example;

//Crie um programa para ler a nota da prova de 15 alunos e armazene num vetor,
//calcule e imprima a média geral. Em seguida conte quantos alunos estão acima da
//média calculada.

import java.util.Arrays;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tam = 15;

        float[] notas = new float[tam];
        float somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota do aluno " + (i + 1));
            notas[i] = s.nextFloat();
            somaNotas += notas[i];
        }

        // Media geral
        float media = somaNotas / tam;

        // Alunos acima da média
        int contAcima = 0;
        for (float nota : notas) {
            if(nota > media)
                contAcima++;
        }

        System.out.println(Arrays.toString(notas));
        System.out.println("Média: " + media);
        System.out.println("Alunos acima da média: " + contAcima);
    }
}
