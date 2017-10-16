package br.com.fiap.challenge.bo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.challenge.dao.ProdutoDAO;
import br.com.fiap.challenge.to.Produto;

public class ProdutoBO {
	
	/**
	 * Metodo que salva o produto no banco de dados
	 * @param produto
	 * @throws SQLException
	 */
	public void save(Produto produto) throws SQLException {
		new ProdutoDAO().save(produto);
	}

	
	/**
	 * Metodo que atualiza o Produto
	 * @param produto	Objeto Produto 
	 * @throws SQLException
	 */
	public void update(Produto produto) throws SQLException {
		new ProdutoDAO().update(produto);
	}

	
	/**
	 * Metodo que efetua o exclusao do Produto
	 * @param codigo	Codigo do produto
	 * @throws SQLException
	 */
	public void delete(int codigo) throws SQLException {
		new ProdutoDAO().delete(codigo);
	}

	
	/**
	 * Metodo que efetua a busca do produto por id
	 * @param codigo	Codigo do produto
	 * @return			Objeto Produto
	 * @throws SQLException
	 */
	public Produto findById(int codigo) throws SQLException {
		return new ProdutoDAO().findById(codigo);
	}

	
	
	/**
	 * Metodo que efetua a busca de todos os produtos
	 * @return		Retorna uma lista de produtos
	 * @throws SQLException
	 */
	public List<Produto> find() throws SQLException {
		return new ProdutoDAO().find();
	}


}
