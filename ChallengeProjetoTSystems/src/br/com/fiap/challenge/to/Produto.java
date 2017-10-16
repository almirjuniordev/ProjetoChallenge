package br.com.fiap.challenge.to;

public class Produto {

	private int codigoProduto;
	private String nomeProduto;
	private double valorProduto;
	private String nomeLocal;
	private int quantidadePeso;
	private String descricao;
	
	public Produto() {
	}
	
	public Produto(String nomeProduto, double valorProduto, String nomeLocal, int quantidadePeso,
			String descricao) {
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.nomeLocal = nomeLocal;
		this.quantidadePeso = quantidadePeso;
		this.descricao = descricao;
	}

	
	/**
	 * Retorna codigo do produto
	 * @return	Codigo do produto
	 */
	public int getCodigoProduto() {
		return codigoProduto;
	}

	
	/**
	 * Atribui codigo Produto
	 * @param codigoProduto
	 */
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	
	/**
	 * Retorna Nome do Produto
	 * @return	Nome do produto
	 */
	public String getNomeProduto() {
		return nomeProduto;
	}

	
	/**
	 * Atribui nome do Produto
	 * @param nomeProduto
	 */
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	
	/**
	 * Retorna valor do Produto
	 * @return
	 */
	public double getValorProduto() {
		return valorProduto;
	}
	
	
	/**
	 * Atribui valor do produto
	 * @param valorProduto
	 */
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	
	/**
	 * Retorna nome Local
	 * @return
	 */
	public String getNomeLocal() {
		return nomeLocal;
	}

	
	/**
	 * Atribui nome Local
	 * @param nomeLocal	nome local
	 */
	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}

	
	/**
	 * Retorna quantidade de Peso
	 * @return
	 */
	public int getQuantidadePeso() {
		return quantidadePeso;
	}

	
	/**
	 * Atribuia quantidade Peso
	 * @param quantidadePeso
	 */
	public void setQuantidadePeso(int quantidadePeso) {
		this.quantidadePeso = quantidadePeso;
	}

	
	/**
	 * Retorna Descricao
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}

	
	/**
	 * Atribui a descricão
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", valorProduto="
				+ valorProduto + ", nomeLocal=" + nomeLocal + ", quantidadePeso=" + quantidadePeso + ", descricao="
				+ descricao + "]";
	}

	
}