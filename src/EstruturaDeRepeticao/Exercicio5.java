package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;

            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
        }

        System.out.println("Soma = " + soma);

        scanner.close();
    }
}