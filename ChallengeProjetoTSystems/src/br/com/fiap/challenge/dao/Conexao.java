package br.com.fiap.challenge.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Almir Junior
 *  */
public class Conexao {
	
	private static Conexao conexao;
	
		
	public Conexao() throws ClassNotFoundException {

		//Registra o driver JDBC para se conectar com o Oracle
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		/*Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");*/
		
	}
	
	
	/**
	 * Tenta conexão
	 * @return 
	 * @throws SQLException
	 */
	
	public static Conexao getInstance() throws SQLException{

		try{
		
			//verifica se existe uma instancia, se nao existir entao instancia uma nova conexão
			if (conexao == null) {
				conexao = new Conexao();
			}
		
		}
		catch(ClassNotFoundException e){
			
			throw new SQLException("O Driver JDBC nao foi encontrado!");
			
		}
		
		return conexao;
	}

	

	/**
	 * Metodo que retorna a conexao do banco de dados Oracle
	 * @return	Instancia da conexao com o banco de dados
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {

		
		String jdbcUrl = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		
		try{
		
			//Abre a conexao com o SGBDR
			return DriverManager.getConnection(jdbcUrl, "RM78653", "061287");
	
		}
		catch (SQLException e) {
			
			e.printStackTrace();
			throw new SQLException("Erro ao abrir a conexão com banco de dados", e);

		}
		
	}
	
	
	/**
	 * Metodo que retorna a conexão de um banco de dados SQL Server
	 * @param usuario
	 * @param senha
	 * @return
	 * @throws SQLException
	 */
	
	public Connection getConnectionSQLServer(String usuario, String senha) throws SQLException {

		
		String jdbcUrl = "jdbc:microsoft:sqlserver://localhost;DatabaseName=2D5;integratedSecurity=true;";
		
		try{
		
			//Abre a conexao com o SGBDR
			return DriverManager.getConnection(jdbcUrl);
	
		}
		catch (SQLException e) {
			
			e.printStackTrace();
			throw new SQLException("Erro ao abrir a conexão com banco de dados", e);

		}
		
	}
}



