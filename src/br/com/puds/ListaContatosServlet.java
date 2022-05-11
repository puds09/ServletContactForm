package br.com.puds;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaContatos")
public class ListaContatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Banco banco = new Banco();
		List<Contato> lista = banco.getContatos();
	
		request.setAttribute("contatos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listaContatos.jsp");
		rd.forward(request, response);
		
	}

}
