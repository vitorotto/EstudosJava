
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Insira um valor: ");
            int num = s.nextInt();

            System.out.println("\nAntecessor: ");
            System.out.println(--num);
        }
    }
}
