package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		double[] altura = new double[n];
		char[] genero = new char[n];
		double menorAltura = 2.5;
		double maiorAltura = 0.0;
		double somaAltura = 0;
		double mediaAltura = 0;
		int contadorF = 0;
		int contadorM = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}

		for (int i = 0; i < n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			} else {
				if (altura[i] < menorAltura) {
					menorAltura = altura[i];
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'F') {
				somaAltura += altura[i];
				contadorF++;
			} else {
				contadorM++;
			}
		}
		
		mediaAltura = somaAltura / contadorF;

		System.out.printf("Menor Altura = %.2f%n", menorAltura);
		System.out.printf("Maior Altura = %.2f%n", maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAltura);
		System.out.printf("Numero de homens = %d%n", contadorM);

		sc.close();
	}

}
