package If;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("digite um numero");
		int num = sc.nextInt();
		
		if (num%5==0) {
			System.out.println("multilho de 5");
		}
	}
}
