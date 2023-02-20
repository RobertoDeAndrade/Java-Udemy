package entities.exercicio.fixacao;

public class PessoaFisica extends Contribuinte{
	
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double imp = 0;
		if (super.getRendaAnual() < 20000.0) {
			imp = super.getRendaAnual() * 0.15;
		} else {
			imp = super.getRendaAnual() * 0.25;
		}
		if (gastosSaude != 0) {
			imp -= gastosSaude / 2;
		}
		return imp;
	}

}
