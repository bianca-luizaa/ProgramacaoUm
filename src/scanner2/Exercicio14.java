package scanner2;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean chovendo = true;
        boolean guardaChuva = false;
        boolean carroDisponivel = true;

        System.out.println(chovendo && guardaChuva);
        System.out.println(guardaChuva || carroDisponivel);
        System.out.println(!chovendo);
        System.out.println(
            chovendo && (guardaChuva || carroDisponivel)
        );
        System.out.println(!(chovendo && guardaChuva));

        sc.close();
    }
}