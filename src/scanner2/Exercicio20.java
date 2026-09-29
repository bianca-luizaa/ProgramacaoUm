package scanner2;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = 70;

        String atendimento = idade >= 60
                ? "Atendimento preferencial"
                : "Atendimento comum";

        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tipo de atendimento: "
                + atendimento);

        sc.close();
    }
}