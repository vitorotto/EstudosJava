import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Conversor de metros para centímetros");
            System.out.println("Insira a metragem: ");
            float meters = s.nextFloat();

            System.out.println("\nIgual a: " + meters * 100 + "cm");
        }
    }
}
