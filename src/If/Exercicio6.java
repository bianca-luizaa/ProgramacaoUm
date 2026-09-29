package If;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("digite um numero");
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println("numero par");
		}
		else {
			System.out.println("numero impar");
		}
	}

}
