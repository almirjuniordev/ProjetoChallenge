package br.com.fiap.challenge.dao;


import br.com.fiap.challenge.to.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO {

	private Connection connection;
	
	
	/**
	 * Construtor da classe Produto
	 * @throws SQLException
	 */
	public ProdutoDAO() throws SQLException {
		this.connection = Conexao.getInstance().getConnection();
	}

	/**
	 * Metodo que salva o produto no banco de dados
	 * @param produto
	 * @throws SQLException
	 */
	public void save(Produto produto) throws SQLException {
		try {
			String insert = "INSERT INTO produto (cd_produto,nm_produto, vl_produto, nm_local,qt_peso, ds_descricao)"
					+ "VALUES (prod_sql.nextval,?,?,?,?,?)";
			PreparedStatement preparedStatement = this.connection.prepareStatement(insert);

			preparedStatement.setString(1, produto.getNomeProduto());
			preparedStatement.setDouble(2, produto.getValorProduto());
			preparedStatement.setString(3, produto.getNomeLocal());
			preparedStatement.setInt(4, produto.getQuantidadePeso());
			preparedStatement.setString(5, produto.getDescricao());
			preparedStatement.execute();
			preparedStatement.close();
			
			
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}

	
	/**
	 * Metodo que atualiza o Produto
	 * @param produto	Objeto Produto 
	 * @throws SQLException
	 */
	public void update(Produto produto) throws SQLException {
		try {
			String update = "update produto set nm_produto=?, vl_produto=?, nm_local=?, qt_peso=?, ds_descricao=?"
					+ "where cd_produto=?";
			PreparedStatement preparedStatement = this.connection.prepareStatement(update);
			preparedStatement.setString(1, produto.getNomeProduto());
			preparedStatement.setDouble(2, produto.getValorProduto());
			preparedStatement.setString(3, produto.getNomeLocal());
			preparedStatement.setInt(4, produto.getQuantidadePeso());
			preparedStatement.setString(5, produto.getDescricao());
			preparedStatement.setInt(6, produto.getCodigoProduto());
			preparedStatement.execute();
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}

	
	/**
	 * Metodo que efetua o exclusao do Produto
	 * @param codigo	Codigo do produto
	 * @throws SQLException
	 */
	public void delete(int codigo) throws SQLException {
		try {
			String delete = "delete produto where cd_produto=?";
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
	 * Metodo que efetua a busca do produto por id
	 * @param codigo	Codigo do produto
	 * @return			Objeto Produto
	 * @throws SQLException
	 */
	public Produto findById(int codigo) throws SQLException {
		try {
			String query = "select * from produto where cd_produto=?";
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setInt(1, codigo);

			ResultSet rs = preparedStatement.executeQuery();
			Produto produto = new Produto();

			if (rs.next()) {
				produto.setCodigoProduto(rs.getInt("cd_produto"));
				produto.setNomeLocal(rs.getString("nm_local"));
				produto.setValorProduto(rs.getDouble("vl_produto"));
				produto.setQuantidadePeso(rs.getInt("qt_peso"));
				produto.setNomeProduto(rs.getString("nm_produto"));
				produto.setDescricao(rs.getString("ds_descricao"));
			}

			return produto;
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}

	
	
	/**
	 * Metodo que efetua a busca de todos os produtos
	 * @return		Retorna uma lista de produtos
	 * @throws SQLException
	 */
	public List<Produto> find() throws SQLException {
		try {
			String query = "select * from produto";
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);

			ResultSet rs = preparedStatement.executeQuery();
			List<Produto> produtos = new ArrayList<>();
			
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setCodigoProduto(rs.getInt("cd_produto"));
				produto.setNomeLocal(rs.getString("nm_local"));
				produto.setValorProduto(rs.getDouble("vl_produto"));
				produto.setQuantidadePeso(rs.getInt("qt_peso"));
				produto.setNomeProduto(rs.getString("nm_produto"));
				produto.setDescricao(rs.getString("ds_descricao"));
				produtos.add(produto);
				
			}

			return produtos;
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}
}
