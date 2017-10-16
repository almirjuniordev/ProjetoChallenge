package br.com.fiap.challenge.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFornecedor
 */
@WebServlet("/fornecedor")
public class ServletFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFornecedor() {
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
			
			response.sendRedirect("fornecedores.jsp");
			
			
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

