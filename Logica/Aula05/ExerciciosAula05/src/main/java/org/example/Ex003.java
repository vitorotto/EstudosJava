package org.example;

// Gere um vetor aleatoriamente com até 100 números. Depois conte quantos deles
// são pares, mostre o vetor e a quantidade de números pares encontrados

import java.util.Arrays;

public class Ex003 {
    public static void main(String[] args) {
        int[] nums = new int[100];
        int contPar = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 101);
        }

        for (int num : nums) {
            if (num % 2 == 0)
                contPar++;
        }

        System.out.println("Vetor");
        System.out.println(Arrays.toString(nums));
        System.out.println("Qnt pares: " + contPar);
    }
}
