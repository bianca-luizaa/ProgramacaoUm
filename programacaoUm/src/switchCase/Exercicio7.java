package switchCase;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Bebidas");
        System.out.println("2 - Lanches");

        System.out.print("Escolha o setor: ");
        int setor = scanner.nextInt();

        System.out.print("Escolha o produto: ");
        int produto = scanner.nextInt();

        switch (setor) {
            case 1:
                switch (produto) {
                    case 1:
                        System.out.println("Água");
                        break;
                    case 2:
                        System.out.println("Refrigerante");
                        break;
                    case 3:
                        System.out.println("Suco");
                        break;
                    default:
                        System.out.println("Produto inválido.");
                }
                break;

            case 2:
                switch (produto) {
                    case 1:
                        System.out.println("Cachorro-quente");
                        break;
                    case 2:
                        System.out.println("Hambúrguer");
                        break;
                    case 3:
                        System.out.println("Pizza");
                        break;
                    default:
                        System.out.println("Produto inválido.");
                }
                break;

            default:
                System.out.println("Setor inválido.");
        }

        scanner.close();
    }
}