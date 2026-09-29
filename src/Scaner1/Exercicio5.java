package Scaner1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double arroz = 27.90;
        double feijao = 9.80;
        double oleo = 8.50;

        double total = arroz + feijao + oleo;
        double media = total / 3;

        System.out.println("Valor total: R$ " + total);
        System.out.println("Valor médio: R$ " + media);

        sc.close();
    }
}