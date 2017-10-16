package br.com.fiap.challenge.to;

import java.io.Serializable;

public class PessoaFisica extends Pessoa implements Serializable  {
	
	
	private long cpf;
	private String rg;
	private String DtNascimento;

	
	/**
	 * Retorna CPF
	 * @return	CPF
	 */
	public long getCpf() {
		return cpf;
	}

	
	/**
	 * Atribui CPF
	 * @param cpf
	 */
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Retorna Rg
	 * @return rg
	 */
	
	public String getRg() {
		return rg;
	}

	/**
	 * Atribui valor ao rg
	 * @param rg
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	
	/**
	 * Retorna data de nascimento
	 * @return
	 */
	public String getDtNascimento() {
		return DtNascimento;
	}

	/**
	 * Atribui valor a data de nascimento
	 * @param dtNascimento
	 */
	public void setDtNascimento(String dtNascimento) {
		DtNascimento = dtNascimento;
	}



	
	
}
