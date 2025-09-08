import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        System.out.println("""
                           Escreva  um  programa  para  ler  o  salário  mensal  atual  de  um  funcionário  e  o
                           percentual de reajuste. Calcular e escrever o valor do novo salário."""
        );

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o salário mensal atual do funcionário");
        float salAtual = s.nextFloat();

        System.out.println("Informe o percentual do reajuste: ");
        float reaj = s.nextFloat();

        // Calculando o reajuste
        System.out.println("Salário reajustado: " + ((salAtual * (reaj / 100) + salAtual)));
    }
}
