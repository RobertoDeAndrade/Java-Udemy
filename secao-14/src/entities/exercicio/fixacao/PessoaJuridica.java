package entities.exercicio.fixacao;

public class PessoaJuridica extends Contribuinte{
	
	private Integer funcionarios;
	
	public PessoaJuridica() {
		super();
	}
	

	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double imposto() {
		double imp = 0;
		if (funcionarios > 10) {
			imp = super.getRendaAnual() * 0.14;
		} else {
			imp = super.getRendaAnual() * 0.16;
		}
		return imp;
	}

}
