package br.com.fiap.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.challenge.dao.Conexao;
import br.com.fiap.challenge.to.Pedido;
import br.com.fiap.challenge.to.Produto;

public class PedidoDAO {

	private Connection connection;

	/**
	 * 
	 * Construtor da classe pessoa
	 * @throws SQLException
	 */
	
	public PedidoDAO() throws SQLException {
		this.connection = Conexao.getInstance().getConnection();
	}

	
	/**
	 * Metodo que salva o peddido
	 * @param pedido 		Objeto pedido
	 * @throws SQLException Caso de algum erro na conexão do banco de dados
	 */
	public void save(Pedido pedido) throws SQLException {
		try {
			String insert = "INSERT INTO ts_pedido (cd_pedido, cd_produto)"
					+ "VALUES (prod_sql.nextval, ?)";
			PreparedStatement preparedStatement = this.connection.prepareStatement(insert);
			for (Produto p : pedido.getProdutos()) {
				preparedStatement.setInt(1, p.getCodigoProduto());
				preparedStatement.execute();
			}
			preparedStatement.close();
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}
	
	/**
	 * Atualiza pedido
	 * @param pedido 		Objeto pedido
	 * @throws SQLException Caso de algum erro na conexão do banco de dados
	 */
	public void update(Pedido pedido) throws SQLException {
		try {
			String update =  "update pedido set ts_pedido (cd_pedido, cd_produto)"
					+ "where (prod_sql.nextval, ?)";
			PreparedStatement preparedStatement = this.connection.prepareStatement(update);
			for (Produto p : pedido.getProdutos()) {
				preparedStatement.setInt(1, p.getCodigoProduto());
				preparedStatement.execute();
			}
			preparedStatement.close();
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}
	
	
	/**
	 * 					Metodo que apaga o pedido
	 * @param codigo 	parametro que representa codigo do pedido
	 * @throws SQLException
	 */
	public void delete(int codigo) throws SQLException {
		try {
			String delete = "delete ts_pedido where cd_pedido=?";
			PreparedStatement preparedStatement = this.connection.prepareStatement(delete);
			preparedStatement.setInt(1, codigo);
			preparedStatement.execute();
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}
	
	/**
	 * Metodo que faz a busca pelo id
	 * @param codigo	Codigo do pedido
	 * @return			retorna o pedido
	 * @throws SQLException
	 */
	public Pedido findById(int codigo) throws SQLException {
		try {
			String query = "select * from ts_pedido where cd_pedido=?";
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setInt(1, codigo);

			ResultSet rs = preparedStatement.executeQuery();
			Pedido pedido = new Pedido();

			if (rs.next()) {
				pedido.setCodigo(rs.getInt("cd_pedido"));
			}

			return pedido;
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}
	
	
	/**
	 * Metodo que efetua a busca dos pedido
	 * @return		Retorna a lista de pedidos
	 * @throws SQLException
	 */
	public List<Pedido> find() throws SQLException {
		try {
			String query = "select * from ts_pedido";
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);

			ResultSet rs = preparedStatement.executeQuery();
			List<Pedido> pedidos = new ArrayList<>();
			
			while (rs.next()) {
				Pedido pedido = new Pedido();
				pedido.setCodigo(rs.getInt("cd_pedido"));
				pedidos.add(pedido);
				
			}

			return pedidos;
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}
}
