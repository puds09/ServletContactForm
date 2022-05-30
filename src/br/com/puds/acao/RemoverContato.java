package br.com.puds.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.puds.modelo.Banco;

public class RemoverContato implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			System.out.println("id: "+request.getParameter("id"));
			String idParam = request.getParameter("id");
			Integer id = Integer.valueOf(idParam);

			Banco banco = new Banco();
			banco.removeContato(id);
			
//			response.sendRedirect("listaContatos");
			return "redirect:entrada?acao=ListaContato";
	}

}
