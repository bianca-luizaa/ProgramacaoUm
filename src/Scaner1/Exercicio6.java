package Scaner1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorEmDolares = 75;
        double cotacaoDolar = 5.62;

        double valorEmReais = valorEmDolares * cotacaoDolar;

        System.out.printf("O monitor custa %.2f reais%n", valorEmReais);

        sc.close();
    }
}