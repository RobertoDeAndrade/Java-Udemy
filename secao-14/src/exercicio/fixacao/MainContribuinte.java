package exercicio.fixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.exercicio.fixacao.Contribuinte;
import entities.exercicio.fixacao.PessoaFisica;
import entities.exercicio.fixacao.PessoaJuridica;

public class MainContribuinte {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dados do contribuinte #" + (i + 1) + ":");
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			if (ch == 'j') {
				System.out.print("Número de funcionários: ");
				int funcionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
		}

		System.out.println();
		System.out.println("Taxas pagas:");
		for (Contribuinte con : list) {
			System.out.println(con.getNome() + ": $" + String.format("%.2f", con.imposto()));
		}

		System.out.println();
		double total = 0;
		for (Contribuinte con : list) {
			total += con.imposto();
		}

		System.out.printf("Total de taxas: $%.2f", total);

		sc.close();

	}

}
