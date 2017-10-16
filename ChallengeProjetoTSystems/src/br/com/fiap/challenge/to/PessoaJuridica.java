package br.com.fiap.challenge.to;

import java.io.Serializable;

public class PessoaJuridica extends Pessoa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cnpj;
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	

}
