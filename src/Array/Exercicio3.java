package Array;

	import java.util.Scanner;

public class Exercicio3 {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        String[] alunos = new String[8];

	        for (int i = 0; i < alunos.length; i++) {
	            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
	            alunos[i] = scanner.nextLine();
	        }

	        System.out.print("Digite o nome que deseja pesquisar: ");
	        String pesquisa = scanner.nextLine();

	        boolean encontrado = false;

	        for (int i = 0; i < alunos.length; i++) {

	            if (alunos[i].equalsIgnoreCase(pesquisa)) {
	                System.out.println("Aluno encontrado na posição: " + i);
	                encontrado = true;
	                break;
	            }
	        }

	        if (!encontrado) {
	            System.out.println("Aluno não encontrado.");
	        }

	        scanner.close();
	    }
	}