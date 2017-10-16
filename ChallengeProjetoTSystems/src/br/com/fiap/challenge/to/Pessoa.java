package br.com.fiap.challenge.to;



public class Pessoa {
	
	private int id;
	private String nome;
	
	private int nrTelefone;
	private String email;
	



	private String endereco;
	
	



	/**Pessoa
	 * Retorna Id
	 * @return	Id
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * Atribui Id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	/**
	 * Retorna Nome
	 * @return	Nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Atribui Nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	/**
	 * Retorna numero de telefone
	 * @return	numero de telefone
	 */
	public int getNrTelefone() {
		return nrTelefone;
	}
	
	/**
	 * Atribui numero de telefone
	 * @param nrTelefone
	 */
	public void setNrTelefone(int nrTelefone) {
		this.nrTelefone = nrTelefone;
	}
	
	
	/**
	 * Retorna um objeto endereço
	 * @return
	 */
	public String getEndereco() {
		return endereco;
	}

	
	/**
	 * Atribui um objeto endereço ao atributo
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	

}
