package Matriz1;

import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] estoque = new int[3][4];

        int estoqueTotal = 0;

        for (int i = 0; i < estoque.length; i++) {

            System.out.println("\nProduto " + (i + 1));

            for (int j = 0; j < estoque[i].length; j++) {

                System.out.print("Quantidade no período " + (j + 1) + ": ");
                estoque[i][j] = scanner.nextInt();
            }
        }

        int maiorEstoque = 0;
        int produtoMaior = 0;

        for (int i = 0; i < estoque.length; i++) {

            int totalProduto = 0;

            for (int j = 0; j < estoque[i].length; j++) {
                totalProduto += estoque[i][j];
            }

            estoqueTotal += totalProduto;

            System.out.println("Produto " + (i + 1) + ": "
                    + totalProduto + " unidades");

            if (totalProduto > maiorEstoque) {
                maiorEstoque = totalProduto;
                produtoMaior = i + 1;
            }
        }

        System.out.println("Estoque total: " + estoqueTotal + " unidades");
        System.out.println("Maior estoque acumulado: Produto "
                + produtoMaior);

        scanner.close();
    }
}