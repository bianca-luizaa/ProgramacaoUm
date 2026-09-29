package Scaner1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeAluno = "Manuel Campos";
        int nota = 6;
        int frequencia = 75;

        String resultado = (nota >= 6 && frequencia >= 75)
                ? "Aprovado"
                : "Reprovado";

        System.out.println(nomeAluno + ": " + resultado);

        sc.close();
    }
}
