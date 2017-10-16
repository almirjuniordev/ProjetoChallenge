package br.com.fiap.challenge.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.challenge.bo.ProdutoBO;
import br.com.fiap.challenge.to.Pedido;
import br.com.fiap.challenge.to.Produto;

/**
 * Servlet implementation class ServletPedidos
 */

@WebServlet("/pedidos")
public class ServletPedidos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Produto> listaDeproduto = new ArrayList<Produto>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPedidos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Produto> listaDeproduto = new ArrayList<Produto>();
		switch (request.getMethod()) {
		case "GET":
			System.out.println("Entrei no GET");

			Produto p1 = new Produto();
			Produto p2 = new Produto();
			Produto p3 = new Produto();
			
			p1.setCodigoProduto(1);
			p1.setNomeProduto("Camiseta");
			p1.setDescricao("Azul");
			
			
			p2.setCodigoProduto(2);
			p2.setNomeProduto("Camiseta");
			p2.setDescricao("Branca");
			
			
			p3.setCodigoProduto(3);
			p3.setNomeProduto("Camiseta");
			p3.setDescricao("Magenta");
			
			listaDeproduto.add(p1);
			listaDeproduto.add(p2);
			listaDeproduto.add(p3);
			
			
			
			
			
			request.setAttribute("listaDeproduto", listaDeproduto);
			RequestDispatcher rd = request.getRequestDispatcher("pedido.jsp");
			
			rd.forward(request, response);
			
			
			break;
			
		case "POST":
			System.out.println("Entrei no POST");
			String[] pedidos = request.getParameterValues("codigo");
			String[] quantidade = request.getParameterValues("quantidade");
			
			List<Produto> produtos = new ArrayList<Produto>();
			ProdutoBO produtoBO = new ProdutoBO();
			
			for (int i = 0; i < pedidos.length; i++) {
				
				Produto p = new Produto();
				try {
					p = produtoBO.findById(Integer.parseInt(pedidos[i]));
				} catch (NumberFormatException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				produtos.add(p);
				
			}
			
			
			
/*		    PrintWriter out = response.getWriter();
		    out.println(pedidos);*/
			/*System.out.println("Entrei no POST");*/
			
			
			
			
			
			
			
			
			break;
		default:
			System.out.println("Metodo HTTP n�o encontrado");
			break;
		}

		
	}

}
