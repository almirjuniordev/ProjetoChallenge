package br.com.fiap.challenge.to;

import java.util.List;

public class Pedido {

	private int codigo;
	private List<Produto> produtos;

	
	/**
	 * Retorna codigo
	 * @return	codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	
	
	/**
	 * Atribui codigo
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Retorna lista de Produtos
	 * @return	Lista de produtos
	 */
	public List<Produto> getProdutos() {
		return produtos;
	}

	
	/**
	 * Atribui produtos
	 * @param produtos
	 */
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
