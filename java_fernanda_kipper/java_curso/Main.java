package java_curso;

public class Main {
    // Exemplos do uso de variáveis e condicionais em Java
    public static void main(String[] args) {

        /* === DECLARAÇÃO DE VARIÁVEIS === */
        
        byte meuByte = 100; // Variável do tipo byte
        short meuShort = 10000; // Variável do tipo short
        int meuInt = 100000; // Variável do tipo int
        long meuLong = 100000L; // Variável do tipo long
        float meuFloat = 10.5f; // Variável do tipo float
        double meuDouble = 20.99; // Variável do tipo double
        char meuChar = 'A'; // Variável do tipo char
        String minhaString = "Vitor"; // Variável do tipo String
        boolean meuBoolean = true; // Variável do tipo boolean
        
        /* === CONDICIONAIS EM JAVA === */

        // Exemplo de uso de condicionais
        if (minhaString.isBlank()) {
            System.out.println("String vazia");
        } else if (minhaString.equals("Vitor")) {
            System.out.println("String é \"Vitor\"");
        } else {
            System.out.println("Falso");
        }

        /* === VETORES EM JAVA === */
        ExemploVetores exemploVetores = new ExemploVetores();
        exemploVetores.exemploVetores();

        /* === ARRAYLISTS EM JAVA === */
        ExemploArrayLists exemploArrayList = new ExemploArrayLists();
        exemploArrayList.exemploArrayLists();

        /* === CASTING (conversão de tipo) === */
        ExemploCastings exemploCastings = new ExemploCastings();
        exemploCastings.exemploCastings();

    }
}