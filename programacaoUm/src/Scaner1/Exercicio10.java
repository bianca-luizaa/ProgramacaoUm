package Scaner1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "João";
        String curso = "Informática";
        int idade = 19;

        System.out.println("==============================");
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("==============================");

        sc.close();
    }
}