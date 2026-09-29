package If;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals("admin")) {

            if (senha.equals("1234")) {
                System.out.println("Acesso permitido.");
            } else {
                System.out.println("Senha incorreta.");
            }

        } else {
            System.out.println("Usuário inexistente.");
        }

        scanner.close();
    }
}