/*
    Faça um programa que leia a idade de uma pessoa expressa em anos, meses e
    dias e mostre-a expressa apenas em dias
*/

import java.util.Date;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        System.out.println("Calcular dis de vida de uma pessoa");
        try (Scanner s = new Scanner(System.in)) {
            int meses;
            int dias;
            Date dataAtual = new Date();

            System.out.println("Quantos anos você tem? ");
            int anos = s.nextInt();

            System.out.println(anos + " anos e quantos meses? ");
            meses = s.nextInt();

            System.out.println(anos + " anos, " + meses + " meses e quantos dias? ");
            dias = s.nextInt();

            // Calculando os dias de vida
            int diasDeVida;
            diasDeVida = ((anos * 365) + (meses * 30)) + dias;

            // Saídas dos dados
            System.out.println("Idade: " + anos + " anos, " + meses + " meses e " + dias + " dia.");
            System.out.println("Dias de vida: " + diasDeVida);
            System.out.println("Data atual: " + dataAtual);
        }

    }
}
