/*
    Faça um algoritmo que receba dois números, calcule e mostre a divisão do primeiro
    número pelo segundo. Sabe-se que o segundo número não pode ser zero, portanto
    não é necessário se preocupar com validações.
*/

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Informe um numero");
            float n1 = s.nextFloat();

            System.out.println("Informe outro número");
            float n2 = s.nextFloat();

            // Calculando e exibindo os resultados
            System.out.println("Resultado: " + (n1 / n2));
        }
    }
}
