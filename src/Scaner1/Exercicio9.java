package Scaner1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean possuiIngresso = true;
        boolean possuiDocumento = false;
        boolean acompanhanteMaiorIdade = true;

        System.out.println(possuiIngresso && possuiDocumento);
        // false: não possui documento.

        System.out.println(possuiIngresso || possuiDocumento);
        // true: possui ingresso.

        System.out.println(!possuiDocumento);
        // true: não possuir documento é false invertido.

        System.out.println(
            possuiIngresso &&
            (possuiDocumento || acompanhanteMaiorIdade)
        );
        // true: possui ingresso e acompanhante maior de idade.

        System.out.println(
            !(possuiIngresso && possuiDocumento)
        );
        // true: a expressão interna é false.

        sc.close();
    }
}