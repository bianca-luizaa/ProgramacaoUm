package scanner2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temperatura = 26.78;

        int temperaturaInteira = (int) temperatura;
        double temperaturaDouble = (double) temperaturaInteira;

        System.out.println("Temperatura original: " + temperatura);
        System.out.println("Temperatura em int: "
                + temperaturaInteira);
        System.out.println("Temperatura em double: "
                + temperaturaDouble);

        sc.close();
    }
}