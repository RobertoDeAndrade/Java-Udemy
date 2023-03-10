package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vet = new double[n];

		double soma = 0;
		double media = 0;

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}

		System.out.println();
		System.out.print("Valores = ");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}

		media = soma / vet.length;

		System.out.printf("\nSoma = %.2f\n", soma);
		System.out.printf("Media = %.2f\n", media);

		sc.close();
	}

}
