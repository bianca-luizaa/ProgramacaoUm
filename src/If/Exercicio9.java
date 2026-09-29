package If;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior ou igual.");
        }

        scanner.close();
    }
}