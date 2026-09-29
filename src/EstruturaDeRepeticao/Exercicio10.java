package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        String resposta;

        do {
            scanner.nextLine();

            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Nota: ");
            double nota = scanner.nextDouble();

            soma += nota;
            quantidade++;

            scanner.nextLine();

            System.out.print("Deseja cadastrar outro aluno? (S/N): ");
            resposta = scanner.nextLine();

        } while (resposta.equalsIgnoreCase("S"));

        double media = soma / quantidade;

        System.out.println("Média das notas = " + media);

        scanner.close();
    }
}