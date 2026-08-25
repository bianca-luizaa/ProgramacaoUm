package If;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("digite sua media");
		int media = sc.nextInt();
		
		if (media >= 7) {
			System.out.println("aluno aprovado");
		}
		else {
			System.out.println("aluno reprovado");
		}
	}

}
