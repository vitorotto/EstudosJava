/*
Escreva um programa que lê a hora de início e de término de um jogo e calcule a
duração do jogo. Sabendo-se que serão lidos apenas horas inteiras, que o jogo pode
durar no máximo 24 horas e ele pode iniciar em um dia e terminar em outro
*/
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a hora de inicio do jogo: ");
        int inicio = s.nextInt();

        System.out.println("Informe a hora do término do jogo: ");
        int fim = s.nextInt();

        // Calculando a duração
        if (fim < inicio) {
            int dia1 = 24 - inicio;
            System.out.println("Trocou de dia. Duração da partida: " + (fim + dia1) + " horas");
        } else if (inicio == fim) {
            System.out.println("Duração da partida: " + 24 + " horas");
        } else {
            System.out.println("Duração da partida: " + (fim - inicio) + " horas");
        }
    }
}
