
import java.util.Scanner;

/*
Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que 
diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a 
pessoa nasceu)
 */

public class Ex002 {
    public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        System.out.println("Nascimento: ");
        int born = s.nextInt();

        if ((2025 - born) >= 18) {
            System.out.println("Vota");
        } else {
            System.out.println("Não vota");
        }
    }
    }
}
