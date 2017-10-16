package br.com.fiap.challenge.bo;

public class OrdemServicoBO {
	private int id;
	private String descricao;
	
	
	
	public void gerarOrdemServico(){
		
	}



	@Override
	public String toString() {
		return "OrdemServico [id=" + id + ", descricao=" + descricao + "]";
	}



	public int getId() {
		return id;
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
}
