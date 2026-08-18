package Scaner1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temperatura = 28;

        String situacao = temperatura > 25
                ? "Dia quente"
                : "Dia agradável";

        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Situação: " + situacao);

        sc.close();
    }
}