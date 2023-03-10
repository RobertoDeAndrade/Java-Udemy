package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos terá o vetor? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		double soma = 0;
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
			soma += vet[i]; 
		}
		
		double media = soma / vet.length;
		System.out.printf("\nMedia do vetor = %.3f%n", media);
		
		System.out.println("Elementos abaixo da média: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < media) {
				System.out.printf("%.1f%n", vet[i]);
			}
		}
		
		sc.close();
	}
}