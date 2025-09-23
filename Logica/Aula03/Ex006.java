/*
Escrever um programa que lê dois valores a e b e escreva se são múltiplos ou não são 
múltiplos  (use  o operador mod, ele retorna o resto da divisão por exemplo (10 mod 5 
retorna 0)
 */

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Informe um valor: ");
            int n1 = s.nextInt();

            System.out.println("Informe outro valor: ");
            int n2 = s.nextInt();

            if ((n1 % n2) == 0) {
                System.out.println("Multiplos");
            } else {
                System.out.println("Não são multiplos");
            }
        }
    }
}
