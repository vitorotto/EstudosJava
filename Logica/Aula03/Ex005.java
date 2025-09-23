/*
A  jornada  de  trabalho  semanal  de  um  funcionário  é  de  40  horas.  O  funcionário  que 
trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular 
com  um  acréscimo  de  50%.  Escreva  um  programa  que  leia  o  número  de  horas 
trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que 
deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o 
mês possua 4 semanas exatas).
 */

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Horas trabalhadas no mês: ");
            float hrsMes = s.nextInt();

            System.out.println("Salário por hora: ");
            float salHr = s.nextFloat();

            float salTotal = (float) hrsMes * salHr;
            float valHrExtra = (float) (salHr + (salHr * 0.5));

            if ((hrsMes / 4) > 40) {
                float hrExtra = hrsMes % 4;
                System.out.println("Horas extras: " + hrExtra);
                System.out.println("Salário total: " + ((float) salTotal + (valHrExtra * hrExtra)));
            } else {
                System.out.println("Salário total: " + salTotal);
            }
        }
    }
}
