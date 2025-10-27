package org.example;

// 21.	Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa que permita a
// entrada das seguintes informações:
// a) Número total de mercadorias no estoque (quantidade total).
// b) Valor de cada mercadoria.
// Ao final imprimir o valor total em estoque e a média de valor das mercadorias

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qtdTotal;
        float valTotal = 0;

        System.out.println("Informe a quantidade de mercadorias: ");
        qtdTotal = s.nextInt();

        for (int i = 1; i <= qtdTotal; i++) {
            System.out.println("Informe o valor da mercadoria " + i);
            valTotal += s.nextFloat();
        }

        float mediaMerc = valTotal / qtdTotal;
        System.out.println("Valor total: " + valTotal + "\nMédia: " + mediaMerc);
    }
}
