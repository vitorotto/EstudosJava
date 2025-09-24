/*
O departamento que controla o índice de poluição do meio ambiente mantém 3 grupos 
de indústrias que são altamente poluentes. O nível de poluição aceitável fica entre 0.05 e 
0.25. Se o nível de poluição sobe acima de 0.3 empresas do grupo 1 são intimadas a 
suspender  suas  atividades.  Se  o  índice  atinge  0.4  as  indústrias  do  grupo  1  e  2  são 
intimadas  a  suspender  suas  atividades.  Se  o  índice  atingir o nível 0.5 os três grupos 
devem suspender suas atividades. Escreva o programa que leia o índice de poluição e 
emita as notificações aos grupos de empresas
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Informe o índice de poluição: ");
        double indPol = s.nextDouble();

        if (indPol > 0.3 && indPol < 0.4)
            System.out.println("Grupo 01: Suspender atividades!");
        else if (indPol >= 0.4 && indPol < 0.5)
            System.out.println("Grupos 01 e 02: Suspender as atividades!");
        else if (indPol >= 0.5)
            System.out.println("Todos devem suspender as atividades!");
        else
            System.out.println("Liberados");
    }
}
