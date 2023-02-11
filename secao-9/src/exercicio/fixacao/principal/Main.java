package exercicio.fixacao.principal;

import java.util.Locale;
import java.util.Scanner;

import exercicio.fixacao.conta.Contas;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Contas conta ;
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y' || resposta == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new Contas(numero, nome, depositoInicial);
		} else {
			conta = new Contas(numero, nome);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(conta);
		
		System.out.print("Enter a deposit value: ");
		conta.depositar(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(conta);
		
		System.out.print("Enter a withdraw value: ");
		conta.sacar(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(conta);
		
		sc.close();
	}
}
