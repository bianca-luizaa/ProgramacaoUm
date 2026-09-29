package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o início: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o final: ");
        int fim = scanner.nextInt();

        int numero = inicio;

        do {
            System.out.println(numero);
            numero++;
        } while (numero <= fim);

        scanner.close();
    }
}