/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
custo final ao consumidor.
*/

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Informe o custo de fábrica do veículo: ");
            float valFabrica = s.nextFloat();

            System.out.println("Valor final: " + (valFabrica + ((valFabrica * (0.28)) + (valFabrica * (0.45)))));
        }

    }
}
