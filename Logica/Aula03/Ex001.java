/*
As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se 
forem  compradas pelo menos 12. Escreva um programa que leia o número de maçãs 
compradas, calcule e escreva o custo total da compra.
*/

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Maças compradas: ");
            int boughtApples = s.nextInt();

            if (boughtApples >= 12) {
                System.out.println("Cada uma sai por R$1,30");
                System.out.println("Total: R$" + ((float)(boughtApples * 1)));
            } else {
                System.out.println("Cada uma sai por R$1,00");
                System.out.println("Total: R$" + ((float)(boughtApples * 1.3)));
            }
        }
    }
}
