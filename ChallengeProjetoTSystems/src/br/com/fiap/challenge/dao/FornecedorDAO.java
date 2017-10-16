package br.com.fiap.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.challenge.to.Fornecedor;
import br.com.fiap.challenge.to.Pessoa;

public class FornecedorDAO {
	
	
	
	private Connection connection;
	
	
	
	
	public FornecedorDAO() throws SQLException {
		super();
		this.connection = Conexao.getInstance().getConnection();
	}


	public void Cadastrar(Fornecedor fornecedor) throws SQLException {
		try {
			
			
			new PessoaDAO().cadastrar(fornecedor);
			
			
			String insert = "INSERT INTO fornecedor (cd_fornecedor,nm_fornecedor, vl_fornecedor, nm_local,qt_peso, ds_descricao)"
					+ "VALUES (prod_sql.nextval,?,?,?,?,?)";
			PreparedStatement preparedStatement = this.connection.prepareStatement(insert);

			preparedStatement.setString(1, fornecedor.getNomeFornecedor());
			preparedStatement.setDouble(2, fornecedor.getValorFornecedor());
			preparedStatement.setString(3, fornecedor.getNomeLocal());
			preparedStatement.setInt(4, fornecedor.getQuantidadePeso());
			preparedStatement.setString(5, fornecedor.getDescricao());
			preparedStatement.execute();
			preparedStatement.close();
			
			
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}

	
	/**
	 * Metodo que atualiza o Fornecedor
	 * @param fornecedor	Objeto Fornecedor 
	 * @throws SQLException
	 */
	public void Atualizar(Fornecedor fornecedor) throws SQLException {
		try {
			String update = "update fornecedor set nm_fornecedor=?, vl_fornecedor=?, nm_local=?, qt_peso=?, ds_descricao=?"
					+ "where cd_fornecedor=?";
			PreparedStatement preparedStatement = this.connection.prepareStatement(update);
			preparedStatement.setString(1, fornecedor.getNomeFornecedor());
			preparedStatement.setDouble(2, fornecedor.getValorFornecedor());
			preparedStatement.setString(3, fornecedor.getNomeLocal());
			preparedStatement.setInt(4, fornecedor.getQuantidadePeso());
			preparedStatement.setString(5, fornecedor.getDescricao());
			preparedStatement.setInt(6, fornecedor.getCodigoFornecedor());
			preparedStatement.execute();
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}

	
	/**
	 * Metodo que efetua o exclusao do Fornecedor
	 * @param codigo	Codigo do fornecedor
	 * @throws SQLException
	 */
	public void Apagar(int codigo) throws SQLException {
		try {
			String delete = "delete fornecedor where cd_fornecedor=?";
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
	 * Metodo que efetua a busca do fornecedor por id
	 * @param codigo	Codigo do fornecedor
	 * @return			Objeto Fornecedor
	 * @throws SQLException
	 */
	public Fornecedor BuscarPorID(int codigo) throws SQLException {
		try {
			String query = "select * from fornecedor where cd_fornecedor=?";
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setInt(1, codigo);

			ResultSet rs = preparedStatement.executeQuery();
			Fornecedor fornecedor = new Fornecedor();

			if (rs.next()) {
				fornecedor.setCodigoFornecedor(rs.getInt("cd_fornecedor"));
				fornecedor.setNomeLocal(rs.getString("nm_local"));
				fornecedor.setValorFornecedor(rs.getDouble("vl_fornecedor"));
				fornecedor.setQuantidadePeso(rs.getInt("qt_peso"));
				fornecedor.setNomeFornecedor(rs.getString("nm_fornecedor"));
				fornecedor.setDescricao(rs.getString("ds_descricao"));
			}

			return fornecedor;
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}

	
	
	/**
	 * Metodo que efetua a busca de todos os fornecedors
	 * @return		Retorna uma lista de fornecedors
	 * @throws SQLException
	 */
	public List<Fornecedor> Listar() throws SQLException {
		try {
			String query = "select * from fornecedor";
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);

			ResultSet rs = preparedStatement.executeQuery();
			List<Fornecedor> fornecedors = new ArrayList<>();
			
			while (rs.next()) {
				Fornecedor fornecedor = new Fornecedor();
				fornecedor.setCodigoFornecedor(rs.getInt("cd_fornecedor"));
				fornecedor.setNomeLocal(rs.getString("nm_local"));
				fornecedor.setValorFornecedor(rs.getDouble("vl_fornecedor"));
				fornecedor.setQuantidadePeso(rs.getInt("qt_peso"));
				fornecedor.setNomeFornecedor(rs.getString("nm_fornecedor"));
				fornecedor.setDescricao(rs.getString("ds_descricao"));
				fornecedors.add(fornecedor);
				
			}

			return fornecedors;
		} catch (SQLException e) {
			throw e;
		} finally {
			this.connection.close();
		}
	}


}
