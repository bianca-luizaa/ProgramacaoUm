package If;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//  média final de um aluno.Se a média for maior ou igual a 7,0 exiba:Aluno aprovado!
		Scanner sc=new Scanner (System.in);
		
		System.out.println("digite sua media");
		int media = sc.nextInt();
		
		if (media >= 7) {
			System.out.println("aluno aprovado");
		}
		
	}

}
