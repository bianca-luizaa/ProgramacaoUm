package Matriz1;

import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        int soma = 0;
        int maior;
        int menor;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("Digite um número: ");
                matriz[i][j] = scanner.nextInt();

                soma += matriz[i][j];
            }
        }

        maior = matriz[0][0];
        menor = matriz[0][0];

        System.out.println("\nMatriz:");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }

            System.out.println();
        }

        double media = (double) soma / 16;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}