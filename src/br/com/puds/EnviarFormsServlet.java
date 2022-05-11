package br.com.puds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.Request;


@WebServlet("/EnviarForms")
public class EnviarFormsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeCliente = request.getParameter("name");
		String emailCliente = request.getParameter("email");
		String telefoneCliente = request.getParameter("phone");
		String mensagemCliente = request.getParameter("message");
		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);
		
		Banco banco = new Banco();

		
		Contato contato = new Contato();
		contato.setNome(nomeCliente);
		contato.setEmail(emailCliente);
		contato.setTelefone(telefoneCliente);
		contato.setMensagem(mensagemCliente);
		
		banco.adiciona(contato);
		
//		request.setAttribute("contato", contato);
		response.sendRedirect("listaContatos");

		System.out.println("adicionando contato no banco");
		
		

		
	}

}
