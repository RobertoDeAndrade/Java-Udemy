package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class ProblemaAlturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		
		Pessoa[] vet = new Pessoa[n];

		for (int i = 0; i < vet.length; i++) {
			sc.nextLine(); // Para fazer a quebra de linha por causa do NextLine
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vet[i] = new Pessoa(nome, idade, altura);
		}

		double somaAltura = 0.0;
		int menorDezesseis = 0;

		for (int i = 0; i < vet.length; i++) {
			somaAltura += vet[i].getAltura();
			if (vet[i].getIdade() < 16) {
				menorDezesseis++;
			}
		}

		double mediaAltura = somaAltura / vet.length;
		double porcentagemMenorDezesseis = menorDezesseis * 100 / vet.length;

		System.out.println();
		System.out.printf("Altura média: %.2f\n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenorDezesseis);

		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getIdade() < 16) {
				System.out.println(vet[i].getNome());
			}
		}

		sc.close();
	}
}