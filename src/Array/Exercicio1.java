package Array;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        System.out.println("\nNotas:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        double media = soma / notas.length;

        System.out.println("Média da turma: " + media);

        scanner.close();
    }
}