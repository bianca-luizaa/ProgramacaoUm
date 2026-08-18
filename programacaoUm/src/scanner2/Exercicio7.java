package scanner2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota = 8.95;

        int notaInteira = (int) nota;
        double notaConvertida = (double) notaInteira;

        System.out.println("Valor inicial: " + nota);
        System.out.println("Valor em int: " + notaInteira);
        System.out.println("Valor novamente em double: "
                + notaConvertida);

        sc.close();
    }
}
