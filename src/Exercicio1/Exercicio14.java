package Exercicio1;

public class Exercicio14 {
    public static void main(String[] args) {

        String nome = "Carlos";
        double salario = 3000.00;
        int tempoEmpresa = 6;

        double bonus = tempoEmpresa >= 5 ? 500 : 0;
        double salarioFinal = salario + bonus;

        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário Final: R$ " + salarioFinal);
    }
}