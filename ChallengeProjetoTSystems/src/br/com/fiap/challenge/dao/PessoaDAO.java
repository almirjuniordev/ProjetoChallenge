package br.com.fiap.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import br.com.fiap.challenge.to.Endereco;
import br.com.fiap.challenge.to.Pessoa;
import br.com.fiap.challenge.to.PessoaFisica;
import br.com.fiap.challenge.to.Produto;

public class PessoaDAO {
	
	
	/**
	 * Metodo que cadastra pessoa 
	 * @param pessoa	Objeto pessoa
	 * @throws Exception
	 */
	public void cadastrar(Pessoa pessoa) throws Exception{
		Connection con = new Conexao().getConnection();
		try
		{
			
			PreparedStatement stmtInsert = 
					con.prepareStatement("insert into TS_PESSOA (cd_pessoa, nm_pessoa, ds_endereco,ds_email, nr_telefone)"+""
							+ "values (seq_pessoa.nextval, ?, ?, ?, ?);");
			
			stmtInsert.setString(2, pessoa.getNome());
			stmtInsert.setString(3, pessoa.getEndereco());
			stmtInsert.setString(4, pessoa.getEmail());
			stmtInsert.setInt(5, pessoa.getNrTelefone());
			
			stmtInsert.executeUpdate();
			
		}
		catch(SQLException ex)
		{
			throw ex;
		}
		catch (Exception e) {
			throw e;
		}
		finally {
			con.close();
		}
		
		
		
	}
	
	
	public Map<Integer, Pessoa> ListarTodos() throws ClassNotFoundException, SQLException{
		Connection con = new Conexao().getConnection();
		try {
			
				StringBuilder sb = new StringBuilder();
				sb.append("SELECT p.CD_PESSOA AS idpessoa, p.NM_PESSOA AS nome, ");
				sb.append("p.DS_ENDERECO AS endereco, p.NR_TELEFONE AS telefone ");
				sb.append("FROM TS_PESSOA p");
				
				PreparedStatement preparedStatement = 
						con.prepareStatement(sb.toString());
	
				ResultSet rs = preparedStatement.executeQuery();
				Map<Integer, Pessoa> listaDePessoas = new HashMap<>();
				
				while (rs.next()) {
					Pessoa pessoa = new Pessoa();
					pessoa.setNome(rs.getString("nome"));
					//pessoa.setEndereco(new Endereco(rs.getString("endereco")));
					pessoa.setNrTelefone(rs.getInt("telefone"));
					listaDePessoas.put(rs.getInt("idpessoa"), pessoa);
					
				}
	
				return listaDePessoas;
			}
			
	
			catch(SQLException ex)
			{
				throw ex;
			}
			catch (Exception e) {
				throw e;
			}
			finally {
				con.close();
			}
	}
}
