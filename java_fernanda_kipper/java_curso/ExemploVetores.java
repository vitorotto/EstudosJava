package java_curso;

public class ExemploVetores {

    /* === VETORES EM JAVA === */

    public void exemploVetores() {

        // Pode ser declarado assim:
        int[] numeros = {10, 20, 30, 40, 50};
        // Ou assim:
        int[] outrosNumeros = new int[5];
        outrosNumeros[0] = 10;
        outrosNumeros[1] = 20;
        outrosNumeros[2] = 30;
        outrosNumeros[3] = 40;
        outrosNumeros[4] = 50;

        // Exemplo de uso de laço de repetição for
        System.out.println("\nExemplo de laço for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }

        // Exemplo de uso de laço de repetição for-each
        System.out.println("\nExemplo de laço for-each:");
        for (int numero : numeros) {
            System.out.println("Número (for-each): " + numero);
        }

        // Exemplo de uso de laço de repetição while
        System.out.println("\nExemplo de laço while:");
        int contador = 0;
        while (contador < outrosNumeros.length) {
            System.out.println("Outro número: " + outrosNumeros[contador]);
            contador++;
        }

        // Exemplo de uso de laço de repetição do-while
        System.out.println("\nExemplo de laço do-while:");
        int outroContador = 0;
        do {
            System.out.println("Outro número (do-while): " + outrosNumeros[outroContador]);
            outroContador++;
        } while (outroContador < outrosNumeros.length);
        
    }
};
