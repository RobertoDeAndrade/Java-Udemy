package entities;

public class Pessoa {

	private String Nome;
	private int idade;
	private double altura;

	public Pessoa(String nome, int idade, double altura) {
		Nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
