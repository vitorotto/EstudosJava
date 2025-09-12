/*
    Escreva um programa para calcular a área de uma circunferência, considerando a
fórmula ÁREA = π * RAIO² . Utilize as variáveis AREA e RAIO, a constante π (pi =
3,14159) e os operadores aritméticos de multiplicação.
*/

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva o valor do raio: ");
        double r = s.nextDouble();

        System.out.println(String.format("Área = " + (Math.PI * (Math.pow(r, 2))), 2));
    }
}
