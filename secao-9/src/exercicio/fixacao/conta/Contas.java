package exercicio.fixacao.conta;

public class Contas {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	// Construtores
	public Contas(int numero, String nome) {
		numeroConta = numero;
		nomeTitular = nome;
	}

	public Contas(int numero, String nome, double depositoInicial) {
		numeroConta = numero;
		nomeTitular = nome;
		depositar(depositoInicial);
	}

	// Get e Set
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	// Metodos
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor + 5.0;
	}
	
	@Override
	public String toString() {
		return "Account " 
				+ numeroConta 
				+ ", Holder: " 
				+ nomeTitular 
				+ ", Balance: $ " 
				+ String.format("%.2f", saldo) 
				+ "\n";
	}
}
