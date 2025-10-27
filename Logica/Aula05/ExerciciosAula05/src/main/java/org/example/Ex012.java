package org.example;

/*Faça um programa que leia uma lista de até 10 salários, a cada salário lido o
programa deve perguntar se o usuário gostaria de continuar a leitura, caso responda
Sim, o programa deve ler mais um salário, até o limite de 10. Ao final ler o percentual
de reajuste dos salários, reajustar e mostrar os novos valores.*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float[] arrSal = new float[10];
        char opc = 's';

        int ind = 0;
        while (opc == 's') {
            System.out.println("Informe o valor do salário " + ind);
            arrSal[ind] = s.nextFloat();
            ind++;

            System.out.println("Deseja inserir mais um salário? (s/n) restantes: " + (arrSal.length - ind));
            opc = s.next().charAt(0);
        }

        System.out.println("Informe o reajuste: ");
        float reaj = s.nextFloat();

        System.out.println("Valores antigos: ");
        System.out.println(Arrays.toString(arrSal));

        for (int i = 0; i < arrSal.length; i++) {
            arrSal[i] = (arrSal[i] * (reaj / 100)) + arrSal[i];
        }

        System.out.println("Valores atualizados: ");
        System.out.println(Arrays.toString(arrSal));
    }
}
