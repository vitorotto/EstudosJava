package org.example;

/*Declare três vetores com até 100 números, o primeiro deve receber números
aleatórios, o segundo deve receber os números pares do primeiro vetor e o segundo
os números ímpares do primeiro vetor. Ao final mostrar os três vetores */

import java.util.Arrays;

public class Ex009 {
    public static void main(String[] args) {
        int tam = 4;
        int[] randArr = new int[tam];
        int[] arrPar = new int[tam];
        int[] arrImp = new int[tam];

        // Vet nums aleatorios
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = (int) (Math.random() * 11);
        }

        // Vet par e imp
        int iPar = 0;
        int iImpar = 0;
        for (int i = 0; i < randArr.length; i++) {
            if (randArr[i] % 2 == 0) {
                arrPar[iPar] = randArr[i];
                iPar++;
            }
            else {
                arrImp[iImpar] = randArr[i];
                iImpar++;
                }
        }

        System.out.println(Arrays.toString(randArr));
        System.out.println(Arrays.toString(arrPar));
        System.out.println(Arrays.toString(arrImp));
    }
}
