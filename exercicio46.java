package exercicios;

import java.util.Scanner;

public class exercicio46 {

    public static void main(String[] args) {

        double saldo, nSaldo;

        Scanner input = new Scanner(System.in);

        System.out.print("digite saldo: ");
        saldo = input.nextDouble();

        nSaldo = saldo * 1.01f;

        System.out.println("Novo saldo: " + nSaldo);

        input.close();
    }
}
