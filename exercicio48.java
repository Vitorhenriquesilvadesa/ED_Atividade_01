package exercicios;

import java.util.Scanner;

public class exercicio48 {
    public static void main(String[] args) {
        double salario, valorPorKW, consumo, valorTotal, valorComDesconto;

        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o valor do salario: ");
        salario = input.nextDouble();

        System.out.print("Entre com o valor do consumo: ");
        consumo = input.nextDouble();
        System.out.println("\n");

        valorPorKW = 100 / (salario / 7);
        valorTotal = consumo * valorPorKW;
        valorComDesconto = valorTotal * 0.9f;

        System.out.printf("Valor por KiloWatt: ");
        System.out.printf("%.2f", valorPorKW);
        System.out.println("\n");

        System.out.print("Valor total: ");
        System.out.printf("%.2f", valorTotal);
        System.out.println("\n");

        System.out.print("Valor com desconto de 10%: ");
        System.out.printf("%.2f", valorComDesconto);
        System.out.println("\n");
        input.close();
    }
}
