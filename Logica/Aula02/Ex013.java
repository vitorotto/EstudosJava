/*
Faça um programa que leia dois valores para as variáveis A e B e efetue a troca
dos valores de forma que a variável A passe a possuir o valor da variável B e a
variável B passe a possuir o valor da variável A. Apresente os valores trocados.
*/

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Informe a variável A: ");
            int a = s.nextInt();

            System.out.println("Informe a variável B: ");
            int b = s.nextInt();

            System.out.println("Valores antes da troca: A = " + a + " B = " + b);

            int aux = a;
            a = b;
            b = aux;

            System.out.println("Valores trocados: A = " + a + " B = " + b);
        }

    }
}
