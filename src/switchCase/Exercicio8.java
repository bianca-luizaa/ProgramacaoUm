package switchCase;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da sala: ");
        int sala = scanner.nextInt();

        System.out.print("Digite o número do filme: ");
        int filme = scanner.nextInt();

        switch (sala) {
            case 1:
                switch (filme) {
                    case 1:
                        System.out.println("Aventura");
                        break;
                    case 2:
                        System.out.println("Comédia");
                        break;
                    case 3:
                        System.out.println("Ficção Científica");
                        break;
                    default:
                        System.out.println("Filme inválido.");
                }
                break;

            case 2:
                switch (filme) {
                    case 1:
                        System.out.println("Terror");
                        break;
                    case 2:
                        System.out.println("Romance");
                        break;
                    case 3:
                        System.out.println("Animação");
                        break;
                    default:
                        System.out.println("Filme inválido.");
                }
                break;

            default:
                System.out.println("Sala inválida.");
        }

        scanner.close();
    }
}