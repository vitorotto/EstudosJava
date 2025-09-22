import java.util.Scanner;

/**
 * Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem 
crescente. 
 */

public class Ex004 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Informe um valor inteiro: ");
            int n1 = s.nextInt();
            
            System.out.println("Informe outro valor inteiro: ");
            int n2 = s.nextInt();

            if (n1 < n2) {
                System.out.println(n1 + ", " + n2);
            } else {
                System.out.println(n2 + ", " + n1);
            }
        }
    }
}
