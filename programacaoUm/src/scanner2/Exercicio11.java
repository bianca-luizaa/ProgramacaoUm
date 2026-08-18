package scanner2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int temperatura = 30;

        System.out.println(temperatura > 25);
        System.out.println(temperatura <= 30);
        System.out.println(temperatura == 20);
        System.out.println(temperatura != 30);

        sc.close();
    }
}