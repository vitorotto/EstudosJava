package org.example;

/*
* Escreva um programa para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor lido não estiver entre 1
* (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após a leitura do valor, escrever o valor lido na tela.
*/

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean pass = false;
        int val = 0;
        while (!pass) {
            System.out.println("Informe um valor entre 1 e 10");
            val = s.nextInt();
            
            if (val >= 1 && val <= 10) {
                pass = true;
            } else {
                System.out.println("Valor fora do escopo, insira o valor novamente.");
            }
        }
        System.out.println(val);
    }
}
