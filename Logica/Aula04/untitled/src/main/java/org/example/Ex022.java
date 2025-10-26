package org.example;

// 22.	O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque. Então o
// funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar “MAIS MERCADORIAS (S/N)?”.
// Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em estoque.

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contMerc = 0;
        int i = 1;
        float valTotal = 0;
        String opc = "s";

        while (!opc.equals("n")) {
            System.out.println("Informe o valor da mercadoria " + i);
            valTotal += s.nextFloat();
            i++;
            contMerc++;

            System.out.println("Deseja inserir mais uma mercadoria? (s/n)");
            opc = s.next();
        }

        float media = valTotal / contMerc;

        System.out.println("Valor total: " + valTotal + "\nMédia: " + media + "\nqtdMerc: " + contMerc);
    }
}
