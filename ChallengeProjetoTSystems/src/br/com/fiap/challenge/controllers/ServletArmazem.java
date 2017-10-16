package br.com.fiap.challenge.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.challenge.to.Produto;

/**
 * Servlet implementation class ServletArmazem
 */
@WebServlet("/armazem")
public class ServletArmazem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletArmazem() {
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
			List<Produto> listaDeProduto = new ArrayList<Produto>();
			
			response.sendRedirect("armazem.jsp");
			
			
			break;
			
		case "POST":
			System.out.println("Entrei no POST");
			break;
		default:
			System.out.println("Metodo HTTP não encontrado");
			break;
		}
	}

}
