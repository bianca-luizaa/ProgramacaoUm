package scanner2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.2;

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.println("Soma: " + soma);
        System.out.println("Média final: " + media);

        sc.close();
    }
}