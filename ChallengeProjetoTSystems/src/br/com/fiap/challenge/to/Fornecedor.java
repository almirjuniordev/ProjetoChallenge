package br.com.fiap.challenge.to;

public class Fornecedor extends PessoaJuridica {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String materiaPrima;
	private double valor;
	private int qtdDias;
	
	
	public String getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(String materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQtdDias() {
		return qtdDias;
	}
	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + getNome() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
