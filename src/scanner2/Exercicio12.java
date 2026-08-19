package scanner2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 850.00;

        System.out.println(saldo >= 1000);
        System.out.println(saldo < 500);
        System.out.println(saldo == 850);
        System.out.println(saldo != 850);

        sc.close();
    }
}