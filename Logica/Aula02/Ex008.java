/*
Desenvolva um programa em C que calcule a área de um triângulo. Utilize as
variáveis AREA, BASE e ALTURA e os operadores aritméticos de multiplicação e
divisão.
* */

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira a altura di triangulo: ");
        float altura = s.nextFloat();

        System.out.println("Insira a base do triangulo: ");
        float base = s.nextFloat();

        // Imprimindo os resultados
        System.out.println("Área calculada: " + ((base * altura) / 2));
    }
}
