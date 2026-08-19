package scanner2;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String produto = "Notebook";
        String preco = "R$ 3500,00";
        String estoque = "18 unidades";

        System.out.println("=========================");
        System.out.println("Produto: " + produto);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque);
        System.out.println("=========================");

        sc.close();
    }
}
