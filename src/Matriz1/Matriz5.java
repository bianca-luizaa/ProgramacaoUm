package Matriz1;

import java.util.Scanner;

public class Matriz5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[5][4];

        double somaGeral = 0;

        int alunoMaior = 0;
        int alunoMenor = 0;

        double maiorMedia = 0;
        double menorMedia = 0;

        int aprovados = 0;

        // Preenchimento
        for (int i = 0; i < notas.length; i++) {

            System.out.println("\nAluno " + (i + 1));

            for (int j = 0; j < notas[i].length; j++) {

                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();

                somaGeral += notas[i][j];
            }
        }

        // Médias
        for (int i = 0; i < notas.length; i++) {

            double somaAluno = 0;

            for (int j = 0; j < notas[i].length; j++) {
                somaAluno += notas[i][j];
            }

            double mediaAluno = somaAluno / notas[i].length;

            System.out.println("Aluno " + (i + 1)
                    + " - Média: " + mediaAluno);

            if (i == 0) {
                maiorMedia = mediaAluno;
                menorMedia = mediaAluno;
            }

            if (mediaAluno > maiorMedia) {
                maiorMedia = mediaAluno;
                alunoMaior = i;
            }

            if (mediaAluno < menorMedia) {
                menorMedia = mediaAluno;
                alunoMenor = i;
            }

            if (mediaAluno >= 7.0) {
                aprovados++;
            }
        }

        double mediaGeral = somaGeral / 20;

        System.out.println("\nMaior média: Aluno "
                + (alunoMaior + 1) + " - " + maiorMedia);

        System.out.println("Menor média: Aluno "
                + (alunoMenor + 1) + " - " + menorMedia);

        System.out.println("Média da turma: " + mediaGeral);

        System.out.println("Alunos aprovados: " + aprovados);

       
        System.out.println("\nNotas:");

        for (double[] aluno : notas) {
            for (double nota : aluno) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}