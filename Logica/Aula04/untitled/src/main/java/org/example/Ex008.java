package org.example;

/*
* 8.	Escreva um programa para pedir que o usuário digite números positivos, ou seja, ele pode digitar quantos números
* positivos ele quiser. Para parar de digitar números, ele de
* ve digitar −1. Após o usuário digitar −1, o programa deve escrever na tela quantos números o usuário digitou
* (a quantidade de números lidos) e a soma dos números que ele digitou.
*/

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = 1;
        int soma = 0;
        int cont = 0;
        while (num != -1) {
            System.out.println("Informe um número positivo: (-1 para parar)");
            num = s.nextInt();
            while (num < 0 && num != -1) {
                System.out.println("Condição de parada incorreta\nDigite novamente: (-1) ou um valor positivo para continuar na soma");
                num = s.nextInt();
            }
            if (num > -1) {
                cont++;
                soma += num;
            }
        }

        System.out.println("Qntd: ".concat(Integer.toString(cont)).concat("\nSoma: ").concat(Integer.toString(soma)));
    }
}
