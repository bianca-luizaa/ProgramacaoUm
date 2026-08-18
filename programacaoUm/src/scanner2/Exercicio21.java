package scanner2;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "João Gomes";
        double salarioBase = 2500.00;
        double valorHoraExtra = 35.00;
        int horasExtras = 8;

        double valorHorasExtras = horasExtras * valorHoraExtra;
        double salarioFinal = salarioBase + valorHorasExtras;

        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Valor das horas extras: R$ "
                + valorHorasExtras);
        System.out.println("Salário final: R$ " + salarioFinal);

        sc.close();
    }
}