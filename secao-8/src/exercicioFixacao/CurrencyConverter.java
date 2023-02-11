package exercicioFixacao;

public class CurrencyConverter {

	public static double priceDollar;
	public static final double IOF = 0.06;
	public static double reais;
	
	public static void converter(double dollars) {
		reais = dollars * priceDollar + (dollars * priceDollar * IOF);
	}
}
