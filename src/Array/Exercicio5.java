package Array;

	import java.util.Scanner;

	public class Exercicio5 {
	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        double[] valores = new double[10];

	        double soma = 0;
	        double maior;
	        double menor;

	        for (int i = 0; i < valores.length; i++) {
	            System.out.print("Digite o " + (i + 1) + "º valor: ");
	            valores[i] = scanner.nextDouble();
	            soma += valores[i];
	        }

	        double media = soma / valores.length;

	        maior = valores[0];
	        menor = valores[0];

	        int acimaMedia = 0;

	        for (int i = 0; i < valores.length; i++) {

	            if (valores[i] > maior) {
	                maior = valores[i];
	            }

	            if (valores[i] < menor) {
	                menor = valores[i];
	            }

	            if (valores[i] > media) {
	                acimaMedia++;
	            }
	        }

	        System.out.println("\nValores:");

	        for (int i = 0; i < valores.length; i++) {
	            System.out.print(valores[i] + " ");
	        }

	        System.out.println("\nSoma: " + soma);
	        System.out.println("Média: " + media);
	        System.out.println("Maior valor: " + maior);
	        System.out.println("Menor valor: " + menor);
	        System.out.println("Valores acima da média: " + acimaMedia);

	        scanner.close();
	    }
	}