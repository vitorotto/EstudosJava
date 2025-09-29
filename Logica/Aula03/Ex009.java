/*
Escrever um programa que lê a identificação de um aluno (número) e as 3 notas obtidas
por ele bem com a média dos exercícios. Para cada aluno calcular a média de
aproveitamento usando a fórmula

MA = N1+N2*2+N3*3+Me / 7
Com base na média obtida atribua um conceito com base na tabela abaixo
Média de aproveitamento // Conceito
    >=9                  |     A
    >=7 e <9             |     B
    >=6 e <7             |     C
    >=4 e <6             |     D
    <4                   |     E

No final o programa deve mostrar o código do aluno, suas notas, a média dos exercícios,
o conceito e se o aluno está Aprovado (Conceito A, B ou C) e Reprovado (D e E)

*/

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o código do aluno: ");
        String cod = s.nextLine();

        System.out.println("Informe a nota 01 do aluno");
        float n1 = s.nextFloat();

        System.out.println("Informe a nota 02 do aluno: ");
        float n2 = s.nextFloat();

        System.out.println("Informe a nota 03 do aluno: ");
        float n3 = s.nextFloat();

        // Calculando ME
        float Me = (n1 + n2 + n3) / 3;

        // Calculando a MA
        float MA = (n1 + n2 * 2 * n3 * 3 + Me) / 7;
        
        String conceito;

        if (MA < 4)
            conceito = "E";
        else if (MA >= 4 && MA <6) {
            conceito = "D";
        } else if (MA >= 6 && MA < 7) {
            conceito = "C";
        } else if (MA >= 7 && MA < 9) {
            conceito = "B";
        } else
            conceito = "A";

        // Imprimindo as informações ao final da execução
        System.out.println("\nCódigo: " + cod);
        System.out.println("Nota 01: " + n1);
        System.out.println("Nota 02: " + n2);
        System.out.println("Nota 03: " + n3);
        System.out.println("Média Aritmética: " + MA);
        System.out.println("Conceito: " + conceito);
    }
}
