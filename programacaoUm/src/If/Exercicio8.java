package If;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("Maior de idade!!");
		}
		else{
			System.out.println("menor de idade!!");
		}
		
	}

}
