package Array;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        int posMaior = 0;
        int posMenor = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("\nValores:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Posição do maior: " + posMaior);

        System.out.println("Menor valor: " + menor);
        System.out.println("Posição do menor: " + posMenor);

        scanner.close();
    }
}