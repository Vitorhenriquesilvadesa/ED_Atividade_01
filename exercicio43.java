package exercicios;

import java.util.Scanner;

public class exercicio43 {
    public static void main(String[] args) {

        double num, log;
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com o logaritmando: ");

        num = input.nextDouble();
        log = Math.log(num) / Math.log(10);

        System.out.println("Logaritmo: " + log);

        input.close();
    }
}
