package br.com.fiap.challenge.bo;

import java.sql.SQLException;
import java.util.Map;

import br.com.fiap.challenge.dao.PessoaDAO;
import br.com.fiap.challenge.to.Pessoa;
import br.com.fiap.challenge.to.PessoaFisica;

public class PessoaBO{ 
	
	

	
	/**
	 * Realiza cadastro de pessoa juridica
	 * @param pessoa
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
	
	public void cadastrar(Pessoa pessoa) throws ClassNotFoundException, SQLException, Exception {
		new PessoaDAO().cadastrar(pessoa);
		
	}
	
	public Map<Integer, Pessoa> ListarTodos() throws ClassNotFoundException, SQLException{
		return new PessoaDAO().ListarTodos();
	}
}
	


