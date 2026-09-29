package Array;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[5][4];

        // Preenchimento das notas
        for (int i = 0; i < notas.length; i++) {

            System.out.println("\nAluno " + (i + 1));

            for (int j = 0; j < notas[i].length; j++) {

                System.out.print("Digite a nota da avaliação "
                        + (j + 1) + ": ");

                notas[i][j] = sc.nextDouble();
            }
        }

        double maiorMedia = 0;
        double menorMedia = 0;

        int alunoMaior = 0;
        int alunoMenor = 0;

        double somaGeral = 0;

        int aprovados = 0;

        System.out.println("\nNotas e médias:");

        for (int i = 0; i < notas.length; i++) {

            double somaAluno = 0;

            System.out.print("Aluno " + (i + 1) + ": ");

            for (int j = 0; j < notas[i].length; j++) {

                System.out.print(notas[i][j] + " ");

                somaAluno += notas[i][j];
            }

            double mediaAluno = somaAluno / notas[i].length;

            somaGeral += somaAluno;

            System.out.println("- Média: " + mediaAluno);

            if (i == 0) {
                maiorMedia = mediaAluno;
                menorMedia = mediaAluno;

                alunoMaior = i + 1;
                alunoMenor = i + 1;
            }

            if (mediaAluno > maiorMedia) {
                maiorMedia = mediaAluno;
                alunoMaior = i + 1;
            }

            if (mediaAluno < menorMedia) {
                menorMedia = mediaAluno;
                alunoMenor = i + 1;
            }

            if (mediaAluno >= 7.0) {
                aprovados++;
            }
        }

        double mediaTurma = somaGeral / (notas.length * notas[0].length);

        System.out.println("\nMaior média: Aluno "
                + alunoMaior + " - " + maiorMedia);

        System.out.println("Menor média: Aluno "
                + alunoMenor + " - " + menorMedia);

        System.out.println("Média da turma: " + mediaTurma);

        System.out.println("Alunos aprovados: " + aprovados);

        sc.close();
    }
}