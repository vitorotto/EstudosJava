/*
Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o
início do ano. Esqueça a questão dos anos bissextos e considere sempre que um
mês possui 30 dias.
*/

import java.util.Scanner;
public class ex012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o mês: ");
        int mes = s.nextInt();

        System.out.println("Informe o dia do mês");
        int dia = s.nextInt();

        System.out.println("Se passaram " + ((mes * 30) + dia) + "dias");
    }
}
