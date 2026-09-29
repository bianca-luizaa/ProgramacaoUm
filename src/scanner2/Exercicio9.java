package scanner2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 15;
        int y = 4;

        int divisaoInteira = x / y;
        double divisaoReal = (double) x / y;

        System.out.println("Divisão inteira: " + divisaoInteira);
        System.out.println("Divisão real: " + divisaoReal);

        sc.close();
    }
}