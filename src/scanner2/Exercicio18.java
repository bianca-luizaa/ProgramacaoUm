package scanner2;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media = 7.3;

        String resultado = media >= 7
                ? "Aprovado"
                : "Reprovado";

        System.out.println(resultado);

        sc.close();
    }
}
