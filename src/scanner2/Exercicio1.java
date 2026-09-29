package scanner2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "João Gomes";
        int idade = 16;
        String curso = "Técnico integrado em informática";
        double altura = 1.71;
        double mediaFinal = 9.0;
        boolean matriculado = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Altura: " + altura);
        System.out.println("Média final: " + mediaFinal);
        System.out.println("Está matriculado: " + matriculado);

        sc.close();
    }
}