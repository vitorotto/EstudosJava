package org.example;

/*Leia uma sequência qualquer de 10 caracteres, armazene em um vetor, depois, leia
outro caractere do teclado, e conte quantas vezes ele aparece no vetor*/

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] vetChar = new char[3];
        char searchChar;

        String letter;
        String searchLetter;

        for (int i = 0; i < vetChar.length; i++) {
            System.out.println("Insira um caractere na pos " + i);
            letter = s.next();
            vetChar[i] = letter.charAt(0);
        }

        System.out.println("Informe o caractere para pesquisar");
        searchLetter = s.next();
        searchChar = searchLetter.charAt(0);

        int contChar = 0;
        for (char c : vetChar) {
            if (searchChar == c)
                contChar++;
        }

        System.out.println("Aparece: " + contChar);
    }
}
