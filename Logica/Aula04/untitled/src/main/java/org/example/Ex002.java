/*
* Escreva um programa que leia 10 valores e conte quantos deles estão no intervalo entre 10 e 20. Depois escreva essa informação
* */

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Iniciando o sistema");
        int cont = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o valor " + i + ": ");
            int val = s.nextInt();
            
            if (val >= 10 && val <= 20) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}
