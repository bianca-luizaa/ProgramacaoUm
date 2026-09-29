package Matriz1;

import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[3][4];

        for (int i = 0; i < notas.length; i++) {

            System.out.println("Aluno " + (i + 1));

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nNotas:");

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Aluno " + (i + 1) + ": ");

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}