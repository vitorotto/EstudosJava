public class Main {
    public static void main(String[] args) {
        /*
        * Números
        * byte -> -128 a 127 (um byte de informação ou 8bit)
        * short -> -32768 a 32767 (2 bytes de informação ou 32 bits)
        * int -> -2147483648 a 2147483647 (2 Bilhões)(4 bytes de informação ou 64 bits)
        * long -> -9223372036854775808 a 9223372036854775807 (8 bytes de informação ou 64 bits)
        *
        * Números Decimais
        * float -> 7 casas decimais - 1234567 (4 bytes de informação ou 32 bits)
        * double -> 15 casas decimais - 123456789123456 (8 bytes de informação ou 64 bits)
        *
        * Textos
        * String -> palavras, frases e textos (o limite é a memória do sistema)
        * char -> uma única letra
        *
        * Verdadeiro ou falso
        * boolean -> true ou false
        * */

        System.out.println("Tipos Primitivos: ");
        byte idade = 120;
        System.out.println(idade);

        short estoque = 32767;
        System.out.println(estoque);

        int numero = 2147483647;
        System.out.println(numero);

        long numeroLongo = 9223372036854775807L;
        System.out.println(numeroLongo);

        float real = 10.1234567f;
        System.out.println(real);

        double doubleReal = 10.123456789123456;
        System.out.println(doubleReal);

        String nome = "Vitor Hugo Otto";
        char inicial = 'V';
        System.out.println("Seu nome é: " + nome + " e sua inicial é: " + inicial );

        boolean botaoAtivado = true;
        boolean botaoDesativado = false;

        System.out.println(botaoAtivado);
        System.out.println(botaoDesativado);

    }
}