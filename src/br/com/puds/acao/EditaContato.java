package br.com.puds.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.puds.modelo.Banco;
import br.com.puds.modelo.Contato;

public class EditaContato implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);

		Banco banco = new Banco();
		Contato contato = banco.buscaContatoPeloId(id);
		
		request.setAttribute("contato", contato);
//		RequestDispatcher rd = request.getRequestDispatcher("editaContato.jsp");
//		rd.forward(request, response);
		return "forward:editaContato.jsp";
	}

}
