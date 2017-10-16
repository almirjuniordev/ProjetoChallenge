package br.com.fiap.challenge.controllers;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.challenge.bo.PessoaBO;
import br.com.fiap.challenge.bo.PessoaFisicaBO;
import br.com.fiap.challenge.to.Endereco;
import br.com.fiap.challenge.to.Pessoa;
import br.com.fiap.challenge.to.PessoaFisica;

/**
 * Servlet implementation class ServletPessoa
 */
@WebServlet("/pessoa")
public class ServletPessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPessoa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */

    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String x = request.getMethod();
		try {
		
		
		if (x.equals("POST")) {
			
			PessoaFisicaBO pessoaBO = new PessoaFisicaBO();
			PessoaFisica pessoa = new PessoaFisica();
			
			pessoa.setNome(request.getParameter("nomePF"));
			pessoa.setCpf(Long.parseLong(request.getParameter("cpf")));
			pessoa.setNrTelefone(Integer.parseInt(request.getParameter("telefonePF")));
			//pessoa.setEndereco(new Endereco(request.getParameter("enderecoPF")));
			
			

					
			pessoaBO.cadastrar(pessoa);

			
			
			/*System.out.println("POST");*/
			
			
		} else {
			
			Map<Integer, Pessoa> p = new PessoaBO().ListarTodos();

		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
