package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMaisVelho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		int contadorIdade = 0;
		int maisVelho = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			if (idade[i] > contadorIdade) {
				contadorIdade = idade[i];
				maisVelho = i;
			}
		}
		
		System.out.print("Pessoa mais velha: " + nome[maisVelho]);

		sc.close();
	}

}
