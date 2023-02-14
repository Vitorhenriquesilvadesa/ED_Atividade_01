package exercicios;

import java.util.Scanner;

public class exercicio23 {

    public static void main(String[] args) {
        int a, d;
        Scanner input = new Scanner(System.in);
        System.out.println("\nDigite um numero de 3 casas: ");
        a = input.nextInt();
        d = a % 100 / 10;
        System.out.println("\nAlgarismo da casa das dezenas: " + d + "\n");
        input.close();
    }
}
