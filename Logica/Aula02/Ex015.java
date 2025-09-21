/*
Uma revendedora de carros usados paga a seus funcionários vendedores um salário
fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5%
do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de
carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele
recebe por carro vendido. Calcule e escreva o salário final do vendedor
*/
import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Informe os seguintes dados: ");

            System.out.println("Carros vendidos: ");
            byte soldCars = s.nextByte();

            System.out.println("Total das vendas: ");
            float totalSoldValue = s.nextFloat();

            System.out.println("O salário: ");
            float salary = s.nextFloat();

            System.out.println("Comissão por carro vendido: ");
            float comissionForCar = s.nextFloat();

            // Calculando o salaário final
            float finalSal = (float) (salary + (soldCars * comissionForCar) + (totalSoldValue * 0.05));

            System.out.println("Salário final: R$" + finalSal);
        }
    }
}
