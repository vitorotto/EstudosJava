package org.example;

/*
* 7.	Escreva um programa para ler uma senha. Se o usuário não digitar a senha correta que é 12345, o programa deve ler
* novamente, até que seja a senha correta. O programa deve também contar quantas vezes o usuário tentou digitar a senha
* incorreta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa informação na tela.
*/

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String pass;
        String correctPass = "12345";
        int cont = -1;

        do {
            System.out.println("Informe a senha: ");
            pass = s.next();
            cont++;
        } while (!pass.equals(correctPass));

        System.out.println("Bem vindo! Tentativas erradas: ".concat(Integer.toString(cont)));

    }
}
