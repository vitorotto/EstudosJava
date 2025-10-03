/*
 * Faça um programa para ler: número da conta do cliente, saldo, débito e crédito. Após,
calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar
se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão
escrever a mensagem 'Saldo Negativo'.
 */
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Número da conta: ");
        int numConta = s.nextInt();

        System.out.println("Saldo da conta: ");
        float saldoConta = s.nextFloat();

        System.out.println("Débito: ");
        float debito = s.nextFloat();

        System.out.println("Crédito: ");
        float credito = s.nextFloat();

        // calculando o saldo total
        float saldoTotal = saldoConta - debito + credito;

        if (saldoTotal >= 0)
            System.out.println("Saldo positivo");
        else
            System.out.println("Saldo negativo");
    }
}
