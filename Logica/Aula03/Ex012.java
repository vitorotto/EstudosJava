import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        byte opc;
        float temp;

        System.out.println(
                """
                    Para qual temperatura deseja converter?
                    Celsius - 1
                    Fahrenheit - 2
                """
        );
        opc = s.nextByte();

        System.out.println("Informe a temperatura: ");
        temp = s.nextFloat();

        switch (opc) {
            case 1:
                // F para C
                // (32 °F − 32) × 5/9 = 0 °C
                System.out.println("F para C: " + ((temp - 32) * 5 / 9));
                break;

            case 2:
                // C para F
                System.out.println("C para F: " + ((temp * 9 / 5) + 32));
                break;

            default:
                System.out.println("Algo inesperado aconteceu...");
        }
    }
}
