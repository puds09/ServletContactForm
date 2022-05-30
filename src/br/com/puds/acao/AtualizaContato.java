package br.com.puds.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.puds.modelo.Banco;
import br.com.puds.modelo.Contato;

public class AtualizaContato implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeCliente = request.getParameter("name");
		String emailCliente = request.getParameter("email");
		String telefoneCliente = request.getParameter("phone");
		String mensagemCliente = request.getParameter("message");
		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);
		
		Banco banco = new Banco();
		Contato contato = null;
		
		for(Contato contatoEditar : banco.getContatos()) {
			if(contatoEditar.getId() == id) {
				contato = contatoEditar;
			}			
		}
		
		contato.setNome(nomeCliente);
		contato.setEmail(emailCliente);
		contato.setTelefone(telefoneCliente);
		contato.setMensagem(mensagemCliente);
		
//		response.sendRedirect("listaContatos");
		return "redirect:entrada?acao=ListaContato";
	}

}
