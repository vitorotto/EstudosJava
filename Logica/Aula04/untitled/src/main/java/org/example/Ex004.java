package org.example;/*
* 4.	Escreva um programa para ler uma idade, mas o programa deve aceitar somente idade válida, ou seja, o programa
*  deve “validar” a leitura da idade. Idade válida tem que ser maior que 0 e menor que 150. Escrever a idade lida
*/

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int idade = -1;
        while (idade < 0 || idade > 150) {
            System.out.println("Informe a idade: (0 a 150 anos)");
            idade = s.nextInt();
        }

        System.out.println("idade: ".concat(Integer.toString(idade)));
    }
}
