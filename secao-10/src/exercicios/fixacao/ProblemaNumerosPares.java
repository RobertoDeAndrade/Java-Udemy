package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNumerosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		int numerosPares = 0;
		System.out.println("\nNúmeros pares?");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				numerosPares++;
			}
		}
		
		System.out.println("\n\nQuantidade de pares = " + numerosPares);
		
		sc.close();
	}
}