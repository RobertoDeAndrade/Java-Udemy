package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vet = new int[n];
		int contadorPares = 0;
		double somaPares = 0;
		double media = 0;

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				somaPares += vet[i];
				contadorPares++;
			}
		}

		if (contadorPares == 0) {
			System.out.println("Nenhum número par");
		} else {
			media = somaPares / contadorPares;
			System.out.printf("Média dos pares = %.1f%n", media);
		}

		sc.close();
	}

}
