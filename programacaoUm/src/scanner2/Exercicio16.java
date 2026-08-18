package scanner2;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String funcionario = "Carlos";
        String cargo = "Analista";
        String salario = "R$ 4200,00";

        System.out.println("*************************");
        System.out.println("Funcionário: " + funcionario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("*************************");

        sc.close();
    }
}