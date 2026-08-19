package Scaner1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Código: ");
        int codigo = sc.nextInt();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int estoque = sc.nextInt();

        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque);

        sc.close();
    }
}