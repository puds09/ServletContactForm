package br.com.puds.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.puds.modelo.Banco;
import br.com.puds.modelo.Contato;

public class ListaContato implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Banco banco = new Banco();
		List<Contato> lista = banco.getContatos();
	
		request.setAttribute("contatos", lista);
//		RequestDispatcher rd = request.getRequestDispatcher("listaContatos.jsp");
//		rd.forward(request, response);
		return "forward:listaContatos.jsp";
	}

}
