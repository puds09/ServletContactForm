package br.com.puds.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.puds.modelo.Banco;
import br.com.puds.modelo.Contato;

public class EnviarForms implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nomeCliente = request.getParameter("name");
		String emailCliente = request.getParameter("email");
		String telefoneCliente = request.getParameter("phone");
		String mensagemCliente = request.getParameter("message");
		
		Banco banco = new Banco();

		
		Contato contato = new Contato();
		contato.setNome(nomeCliente);
		contato.setEmail(emailCliente);
		contato.setTelefone(telefoneCliente);
		contato.setMensagem(mensagemCliente);
		
		if(contato.getNome() != null)
			banco.adiciona(contato);
		
//		response.sendRedirect("listaContatos");
		return "forward:index.jsp";
	}

}
