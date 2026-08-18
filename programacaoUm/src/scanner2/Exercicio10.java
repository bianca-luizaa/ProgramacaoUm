package scanner2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalAlunos = 23;
        int grupos = 5;

        int divisaoInteira = totalAlunos / grupos;
        double divisaoReal = (double) totalAlunos / grupos;

        System.out.println("Divisão inteira: " + divisaoInteira);
        System.out.println("Divisão real: " + divisaoReal);

        sc.close();
    }
}