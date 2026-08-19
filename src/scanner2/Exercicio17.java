package scanner2;


import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int estoque = 3;

        String situacao = estoque < 5
                ? "Estoque baixo"
                : "Estoque suficiente";

        System.out.println(situacao);

        sc.close();
    }
}