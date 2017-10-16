package br.com.fiap.challenge.to;

public class Funcionario {
	
	private int id;
	private String nomeCompleto;
	private String usuario;
	private String senha;
	private String Departamento;
	
	
	public void cadastrarFuncionario(){
		
	}


	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nomeCompleto=" + nomeCompleto + ", usuario=" + usuario + ", senha=" + senha
				+ ", Departamento=" + Departamento + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getDepartamento() {
		return Departamento;
	}


	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

}
