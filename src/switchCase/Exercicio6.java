package switchCase;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Manhã");
        System.out.println("2 - Tarde");

        System.out.print("Escolha o turno: ");
        int turno = scanner.nextInt();

        System.out.print("Escolha a disciplina: ");
        int disciplina = scanner.nextInt();

        switch (turno) {
            case 1:
                switch (disciplina) {
                    case 1:
                        System.out.println("Matemática");
                        break;
                    case 2:
                        System.out.println("Português");
                        break;
                    case 3:
                        System.out.println("Física");
                        break;
                    default:
                        System.out.println("Disciplina inválida.");
                }
                break;

            case 2:
                switch (disciplina) {
                    case 1:
                        System.out.println("História");
                        break;
                    case 2:
                        System.out.println("Geografia");
                        break;
                    case 3:
                        System.out.println("Biologia");
                        break;
                    default:
                        System.out.println("Disciplina inválida.");
                }
                break;

            default:
                System.out.println("Turno inválido.");
        }

        scanner.close();
    }
}