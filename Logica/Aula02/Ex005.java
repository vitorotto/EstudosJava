import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Um  motorista  deseja  colocar  no  seu  tanque  X  reais  de  gasolina.  Escreva  um programa  para  ler  o  preço  do  litro  da  gasolina  e  o  valor  do  pagamento, e exibir  quantos litros ele conseguiu colocar no tanque.");

        System.out.println("Insira o valor do litro da gasolina: ");
        float valGas = s.nextFloat();

        System.out.println("Insira o valor pago: ");
        float valPago = s.nextFloat();

        // calculando a litragem
        System.out.println("Litros abastecidos: " + (valPago / valGas));
    }
}
