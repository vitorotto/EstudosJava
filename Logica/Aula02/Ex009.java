
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int n1 = s.nextInt();

        System.out.println("Insira outro valor inteiro: ");
        int n2 = s.nextInt();

        // Exibindo os resultados
        System.out.println("Soma dos dois valores: " + (n1 + n2));
    }
}
