/*
    Escreva um programa para ler o número total de eleitores de um município, o
    número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
    cada um representa em relação ao total de eleitores.
*/

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        System.out.println("Sistema de eleição muito básico");

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Insira o número de eleitores da cidade: ");
            int numEleitores = s.nextInt();

            System.out.println("Inira o número de votos");
            System.out.println("Brancos: ");
            int numBrancos = s.nextInt();

            System.out.println("Nulos: ");
            int numNulos = s.nextInt();

            System.out.println("Válidos: ");
            int numValidos = s.nextInt();

            // Calculando e escrevendo
            float percentBrancos = numEleitores * ((float) numBrancos / 100);
            float percentValidos = numEleitores * ((float) numValidos / 100);
            float percentNulos = numEleitores * ((float) numNulos / 100);

            System.out.println("Total de eleitores: " + numEleitores);
            System.out.println("\nPercentuais: ");
            System.out.println("Brancos: " + percentBrancos + "%");
            System.out.println("Válidos: " + percentValidos + "%");
            System.out.println("Nulos: " + percentNulos + "%");

            System.out.println("\nTotais: ");
            System.out.println("Votos: " + (percentValidos + percentBrancos + percentNulos) + "%");
            System.out.println("Não votaram: " + (numEleitores - (percentValidos + percentBrancos + percentNulos)) + "%");
        }
    }
}
