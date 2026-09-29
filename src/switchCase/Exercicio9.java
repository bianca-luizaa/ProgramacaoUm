package switchCase;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Informática");
        System.out.println("2 - Telefonia");

        System.out.print("Escolha a categoria: ");
        int categoria = scanner.nextInt();

        System.out.print("Escolha o produto: ");
        int produto = scanner.nextInt();

        switch (categoria) {
            case 1:
                switch (produto) {
                    case 1:
                        System.out.println("Notebook");
                        break;
                    case 2:
                        System.out.println("Mouse");
                        break;
                    case 3:
                        System.out.println("Teclado");
                        break;
                    default:
                        System.out.println("Produto inválido.");
                }
                break;

            case 2:
                switch (produto) {
                    case 1:
                        System.out.println("Smartphone");
                        break;
                    case 2:
                        System.out.println("Carregador");
                        break;
                    case 3:
                        System.out.println("Fone de ouvido");
                        break;
                    default:
                        System.out.println("Produto inválido.");
                }
                break;

            default:
                System.out.println("Categoria inválida.");
        }

        scanner.close();
    }
}