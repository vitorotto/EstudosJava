package org.example;

// Criar um vetor A com 5 elementos, carregar ele com números aleatórios. Declarar
// um vetor B. Copiar todos os elementos do Vetor A para o Vetor B e mostrar os dois
// na tela;

public class Ex001 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int num : b) {
            System.out.println(num);
        }
    }
}
