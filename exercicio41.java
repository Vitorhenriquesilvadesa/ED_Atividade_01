package exercicios;

import java.util.Scanner;

public class exercicio41 {
    public static void main(String[] args) {
        double a, b, c, d, mp;
        Scanner input = new Scanner(System.in);

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();

        mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10;

        System.out.println("media ponderada: " + mp);

        input.close();
    }
}
