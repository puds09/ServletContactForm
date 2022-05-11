package br.com.puds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditaContato")
public class EditaContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);

		Banco banco = new Banco();
		Contato contato = banco.buscaContatoPeloId(id);
		
		request.setAttribute("contato", contato);
		RequestDispatcher rd = request.getRequestDispatcher("editaContato.jsp");
		rd.forward(request, response);
		
	}

}
