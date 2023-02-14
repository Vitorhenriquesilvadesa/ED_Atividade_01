package exercicios;

import java.util.Scanner;

public class exercicio44 {

    public static void main(String[] args) {

        double num, log, base;
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o logaritmando: ");
        num = input.nextDouble();

        System.out.print("Entre com a base: ");
        base = input.nextDouble();

        log = Math.log(num) / Math.log(base);

        System.out.println("Logaritmo de " + num + " na base " + base + " e: " + log);

        input.close();
    }
}
