package exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		CurrencyConverter.priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.converter(sc.nextDouble());
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.reais));
		
		sc.close();
	}
}
