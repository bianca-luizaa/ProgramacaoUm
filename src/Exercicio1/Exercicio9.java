package Exercicio1;

public class Exercicio9 {
    public static void main(String[] args) {

        boolean possuiIngresso = true;
        boolean possuiDocumento = false;
        boolean acompanhanteMaiorIdade = true;

        System.out.println(possuiIngresso && possuiDocumento);

        System.out.println(possuiIngresso || possuiDocumento);
 
        System.out.println(!possuiDocumento);
    
        System.out.println(
            possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade)
        );
  
        System.out.println(!(possuiIngresso && possuiDocumento));
    }
}