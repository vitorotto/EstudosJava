/*
 * Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
 */

import java.util.Scanner;
import javax.xml.transform.Source;

public class Ex003 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Informe um valor: ");
            int n1 = s.nextInt();

            System.out.println("Informe outro valor");
            int n2 = s.nextInt();

            int maior;

            if (n1 > n2)
                maior = n1;
            else
                maior = n2;
            
            System.out.println("O maior é: " + maior);
        }
    }
}
