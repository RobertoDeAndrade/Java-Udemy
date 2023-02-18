package entities.exercicio.fixacao;

public class ProdutoImportado extends Produto {

	private Double taxaAlfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double precoTotal() {
		return super.getPreco() + taxaAlfandega;
	}

	@Override
	public String etiquetaPreco() {
		return super.getNome() 
				+ " - $" + String.format("%.2f", precoTotal()) 
				+ " (Taxa da alfândega: $" 
				+ String.format("%.2f", taxaAlfandega)
				+ ")";
	}

}
