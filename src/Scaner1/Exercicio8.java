package Scaner1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numA = 7;
        int numB = 2;

        int divisaoInteira = numA / numB;
        double divisaoReal = (double) numA / numB;

        System.out.println("Divisão inteira: " + divisaoInteira);
        System.out.println("Divisão real: " + divisaoReal);

        sc.close();
    }
}