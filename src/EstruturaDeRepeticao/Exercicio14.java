package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("Soma: " + soma);

        scanner.close();
    }
}