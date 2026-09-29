package If;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("digite sua idade");
		int num = sc.nextInt();
		
		if (num>=60) {
			System.out.println("tem direito a desconto");
		}
		
	}

}
