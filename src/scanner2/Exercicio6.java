package scanner2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double quilometros = 185;

        double metros = quilometros * 1000;

        System.out.println("Distância em metros: " + metros + " m");

        sc.close();
    }
}