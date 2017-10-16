package br.com.fiap.challenge.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.challenge.dao.PedidoDAO;
import br.com.fiap.challenge.to.Pedido;

public class PedidoBO {
	
	
	/**
	 * Medodo que salva o pedido no Banco de dados
	 * @param pedido
	 * @throws SQLException
	 */
	public void save(Pedido pedido) throws SQLException {
		new PedidoDAO().save(pedido);
	}
	
	
	/**
	 * Metodo que atualiza o pedido
	 * @param pedido
	 * @throws SQLException
	 */
	public void update(Pedido pedido) throws SQLException {
		new PedidoDAO().update(pedido);
	}
	
	
	/**
	 * Metodo que apaga o pedido
	 * @param codigo	Codigo do pedido
	 * @throws SQLException
	 */
	public void delete(int codigo) throws SQLException {
		new PedidoDAO().delete(codigo);
	}
	
	
	/**
	 * Metodo
	 * @param codigo 	Codigo do pedido
	 * @return			retorna o objeto pedido
	 * @throws SQLException
	 */
	public Pedido findById(int codigo) throws SQLException {
		return new PedidoDAO().findById(codigo);
		
	}
	
	
	/**
	 * Metodo que lista todos os pedidos	
	 * @return		retorna uma lista de pedidos
	 * @throws SQLException
	 */
	public List<Pedido> find() throws SQLException {
		return new PedidoDAO().find();
	}
	

}
