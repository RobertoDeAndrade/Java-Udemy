package exemplos.aula;

import java.util.Locale;
import java.util.Scanner;

public class ExemploUm {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas: ");
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double media = soma / n;
		
		System.out.printf("A média das alturas é: %.2f%n", media);

		sc.close();
	}
}