/*
Localização de Ponto no Plano Dados um par de valores X, Y, que representam as
coordenadas de um ponto no plano cartesiano, determinar a localização do ponto, se em
um quadrante, um dos eixos ou na origem.
*/

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o valor de X: ");
        int x = s.nextInt();

        System.out.println("informe o valor de y: ");
        int y = s.nextInt();

        // Verificando se está em um dos quadrantes
        if (x > 0 && y < 0) {
            System.out.println("No quadrante 04");
        } else if (x < 0 && y < 0) {
            System.out.println("No quadrante 03");
        } else if (x > 0 && y > 0) {
            System.out.println("No quadrante 02");
        } else if (x < 0 && y > 0) {
            System.out.println("No quadrante 01");
        }

        if (x == 0 && y == 0) {
            System.out.println("No centro do plano");
        } else if (x > 0 && y == 0) {
            System.out.println("No eixo X, lado direito");
        } else if (x < 0 && y == 0) {
            System.out.println("No eixo X, lado esquerdo");
        } else if (x == 0 && y > 0) {
            System.out.println("No eixo y, lado de cima");
        } else {
            System.out.println("No eixo y, no lado de baixo");
        }
    }
}
