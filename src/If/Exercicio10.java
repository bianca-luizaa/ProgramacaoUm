package If;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        if (temperatura >= 30) {
            System.out.println("Está calor.");
        } else {
            System.out.println("A temperatura está agradável.");
        }

        scanner.close();
    }
}