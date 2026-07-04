package java_curso;

public class ExemploCastings {

    /* === CASTING (conversão de tipo) === */
    
    public void exemploCastings() {
        
        // Conversão de int para double (casting implícito)
        int numeroInteiro = 10;
        double numeroDecimal = 20.5;
        double resultado = numeroInteiro + numeroDecimal; // Casting implícito
        System.out.println("\nResultado da soma (casting implícito): " + resultado);

        // Conversão de char para int (casting implícito)
        char letra = 'A';
        int valorAscii = letra; // Casting implícito
        System.out.println("Valor ASCII da letra (casting implícito): " + valorAscii);

        // Conversão de double para int (casting explícito)
        double outroNumeroDecimal = 30.7;
        int outroNumeroInteiro = (int) outroNumeroDecimal; // Casting explícito
        System.out.println("Número decimal convertido para inteiro (casting explícito): " + outroNumeroInteiro);

        // Conversão de String para int (casting explícito)
        String numeroString = "40";
        int numeroConvertido = Integer.parseInt(numeroString); // Casting explícito
        System.out.println("Número convertido de String para int (casting explícito): " + numeroConvertido);

        // Conversão de int para String (casting explícito)
        int outroNumeroInteiro2 = 50;
        String outroNumeroString = Integer.toString(outroNumeroInteiro2); // Casting explícito
        System.out.println("Número convertido de int para String (casting explícito): " + outroNumeroString);
    }
}
