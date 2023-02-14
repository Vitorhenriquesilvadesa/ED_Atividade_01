package exercicios;

import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args) {

        int dividendo, divisor;
        Scanner input = new Scanner(System.in);

        dividendo = input.nextInt();
        divisor = input.nextInt();

        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;

        input.close();

        System.out.println("dividendo: " + dividendo);
        System.out.println("divisor: " + divisor);
        System.out.println("quociente: " + quociente);
        System.out.println("resto: " + resto);
    }
}
