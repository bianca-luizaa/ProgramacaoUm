package Exercicio2;

public class Exercicio13 {
    public static void main(String[] args) {

        boolean possuiCNH = true;
        boolean possuiCarro = false;
        boolean possuiDinheiro = true;

        System.out.println(possuiCNH && possuiCarro);
        // false: possui CNH, mas não possui carro.

        System.out.println(possuiCarro || possuiDinheiro);
        // true: não possui carro, mas possui dinheiro.

        System.out.println(!possuiCNH);
        // false: possui CNH.

        System.out.println(possuiCNH && possuiDinheiro);
        // true: possui CNH e dinheiro.

        System.out.println(!(possuiCarro || possuiDinheiro));
        // false: possui dinheiro, então a expressão interna é true.
    }
}