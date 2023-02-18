package exercicio.fixacao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.exercicio.fixacao.Produto;
import entities.exercicio.fixacao.ProdutoImportado;
import entities.exercicio.fixacao.ProdutoUsado;

public class Principal {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> list = new ArrayList<>();

		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Informações do produto #" + (i + 1));
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Taxa de alfândega: ");
				Double taxaAlfandega = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			} else if (ch == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				LocalDate dataFabricacao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new ProdutoUsado(nome, preco, dataFabricacao));
			} else {
				list.add(new Produto(nome, preco));
			}
		}

		System.out.println("\nEtiquetas de preço: ");
		for (Produto pro : list) {
			System.out.println(pro.etiquetaPreco());
		}

		sc.close();

	}

}
