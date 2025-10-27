package org.example;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] userArr = new int[3];
        int maior = userArr[0];
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < userArr.length; i++) {
            System.out.println("Informe o valor da pos " + i);
            userArr[i] = s.nextInt();
        }

        for (int num: userArr) {

            if (num < menor)
                menor = num;
            if (num > maior)
                maior = num;
        }

        System.out.println("Maior: " + maior + "\nMenor: " + menor);
    }
}
