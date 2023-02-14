package exercicios;

import java.util.Scanner;

public class exercicio42 {
    public static void main(String[] args) {
        double grau, radiano;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um angulo em graus: ");
        grau = input.nextDouble();
        System.out.println("");
        radiano = grau / 180 * Math.PI;

        System.out.println("sen: " + Math.sin(radiano));
        System.out.println("cos: " + Math.cos(radiano));
        System.out.println("tan: " + Math.tan(radiano));
        System.out.println("sec: " + 1 / Math.cos(radiano));
        System.out.println("co-sec: " + 1 / Math.sin(radiano));
        System.out.println("co-tan: " + 1 / Math.tan(radiano));

        input.close();
    }
}
