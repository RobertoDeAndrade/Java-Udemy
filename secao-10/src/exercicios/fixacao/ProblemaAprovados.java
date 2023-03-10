package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProblemaAprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		Aluno[] aluno = new Aluno[n];

		for (int i = 0; i < aluno.length; i++) {
			System.out.println("Digite o nome, a primeira e a segunda nota do " + (i + 1) + "o aluno:");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			aluno[i] = new Aluno(nome, nota1, nota2);
		}

		System.out.println("Alunos aprovados:");

		for (int i = 0; i < aluno.length; i++) {
			if ((aluno[i].getNota1() + aluno[i].getNota2()) / 2 >= 6) {
				System.out.println(aluno[i].getNome());
			}
		}

		sc.close();
	}
}
