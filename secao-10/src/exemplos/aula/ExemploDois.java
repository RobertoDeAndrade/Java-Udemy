package exemplos.aula;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ExemploDois {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantos produtos serão cadastrados: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}

		double media = soma / n;
		System.out.printf("\nA média dos produtos é de: %.2f\n\n", media);

//		for (int i=0; i<vect.length; i++) {
//			System.out.println("Nome do " + (i+1) + "º produto: " + vect[i].getName());
//			System.out.println("Valor do " + (i+1) + "º produto: " + vect[i].getPrice() + "\n");
//		}

		sc.close();
	}
}
