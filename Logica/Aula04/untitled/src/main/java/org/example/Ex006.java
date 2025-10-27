package org.example;

/*
* 6.	Escreva um programa que leia três notas de um aluno e calcule sua média. Ao final do programa pergunte se deseja
*  efetuar o cálculo para mais algum aluno. Se o usuário receber digitar S, leia novamente as três notas até que o usuário responda não.
* */
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String opc = "s";
        while (opc.equals("s")) {
            float n1 = -1, n2 = -1, n3 = -1;

            while (n1 < 0 || n1 > 10) {
                System.out.println("Informe a nota do 01 do aluno: ");
                n1 = s.nextFloat();
            }
            while (n2 < 0 || n2 > 10) {
                System.out.println("Informe a nota do 02 do aluno: ");
                n2 = s.nextFloat();
            }
            while (n3 < 0 || n3 > 10) {
                System.out.println("Informe a nota do 03 do aluno: ");
                n3 = s.nextFloat();
            }

            float media = (n1 + n2 + n3) / 3;

            System.out.println("Média: ".concat(Float.toString(media)));

            System.out.println("Deseja inserir outro aluno? ");
            opc = s.next();
        }
    }
}
