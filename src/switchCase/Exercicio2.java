package switchCase;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Escolha uma operação: ");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Resultado: " + (n1 - n2));
                break;

            case 3:
                System.out.println("Resultado: " + (n1 * n2));
                break;

            case 4:
                if (n2 != 0) {
                    System.out.println("Resultado: " + ((double) n1 / n2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}