package Exercicio2;

public class Exercicio14 {
    public static void main(String[] args) {

        boolean chovendo = true;
        boolean guardaChuva = false;
        boolean carroDisponivel = true;

        System.out.println(chovendo && guardaChuva);
        // false: está chovendo, mas não há guarda-chuva.

        System.out.println(guardaChuva || carroDisponivel);
        // true: não há guarda-chuva, mas há carro disponível.

        System.out.println(!chovendo);
        // false: está chovendo.

        System.out.println(chovendo && (guardaChuva || carroDisponivel));
        // true: está chovendo e existe carro disponível.

        System.out.println(!(chovendo && guardaChuva));
        // true: a expressão interna é false.
    }
}