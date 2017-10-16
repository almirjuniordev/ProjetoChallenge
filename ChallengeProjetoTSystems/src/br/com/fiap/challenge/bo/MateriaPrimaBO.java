package br.com.fiap.challenge.bo;

public class MateriaPrimaBO {
	private int id;
	private String descricao;
	private String cor;
	private double preco;
	
	public void solicitarMateriaPrima(){
		
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "MateriaPrima [id=" + id + ", descricao=" + descricao + ", cor=" + cor + ", preco=" + preco + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
