package exercicios;

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        int data, dia, mes, ano;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a data no formato DDMMAA: ");
        data = input.nextInt();
        input.close();
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);
    }
}
