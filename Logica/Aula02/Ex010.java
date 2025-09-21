/*
* Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a
* convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5, na
* qual F é a temperatura em Fahrenheit e C é a temperatura em Celsius;
*/

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Informe a temperatura em C°: ");
            float celcius = s.nextFloat();

            // Calculando e exibindo os resultados
            System.out.println("fahrenheit: " + ((9 * celcius + 160)) / 5);
        }
    }
}
