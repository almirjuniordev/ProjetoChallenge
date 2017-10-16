package br.com.fiap.challenge.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.challenge.to.Pedido;
import br.com.fiap.challenge.to.Produto;

/**
 * Servlet implementation class ServeltStatus
 */
@WebServlet("/status")
public class ServeltStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeltStatus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		switch (request.getMethod()) {
		case "GET":
			System.out.println("Entrei no GET");
			

			
			response.sendRedirect("status.jsp");
			
			
			break;
			
		case "POST":
			System.out.println("Entrei no POST");
			List<Produto> listaDeproduto = new ArrayList<Produto>();
			Produto p1 = new Produto();
			Produto p2 = new Produto();
			
			
			p1.setCodigoProduto(1);
			p1.setNomeProduto("Camiseta");
			p1.setDescricao("Azul");
			
			
			p2.setCodigoProduto(2);
			p2.setNomeProduto("Camiseta");
			p2.setDescricao("Branca");
			
			
			
			listaDeproduto.add(p1);
			listaDeproduto.add(p2);
			
			
			
			
			
			request.setAttribute("listaDeproduto", listaDeproduto);
			RequestDispatcher rd = request.getRequestDispatcher("pedido.jsp");
			
			rd.forward(request, response);
			
			
			break;
		default:
			System.out.println("Metodo HTTP não encontrado");
			break;
		}
	}

}
