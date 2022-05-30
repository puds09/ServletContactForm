package br.com.puds.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class Banco {

	private static List<Contato> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	
	static {
		Contato contato = new Contato();
		contato.setId(chaveSequencial++);
		contato.setNome("Pedro");
		contato.setEmail("email@gmail.com");
		contato.setTelefone("(61)99999-9999");
		contato.setMensagem("Oi, meu nome é Pedro");
		contato.setId(chaveSequencial++);
		
		Contato contato2 = new Contato();
		contato2.setId(chaveSequencial++);
		contato2.setNome("Puds");
		contato2.setEmail("email2@gmail.com");
		contato2.setTelefone("(61)00000-0000");
		contato2.setMensagem("Oi, meu nome é Puds");
		contato2.setId(chaveSequencial++);

		lista.add(contato);
		lista.add(contato2);		
		
		Usuario u1 = new Usuario();
		u1.setLogin("nico");
		u1.setSenha("12345");
		Usuario u2 = new Usuario();
		u2.setLogin("puds");
		u2.setSenha("321");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}
	
	
	public void adiciona(Contato contato) {
		contato.setId(Banco.chaveSequencial++);
		lista.add(contato);
	}


	public List<Contato> getContatos(){
		return Banco.lista;
	}

	public void removeContato(Integer id) {
		
		Iterator<Contato> it = lista.iterator();

		while(it.hasNext()) {
			Contato cont = it.next();

			if(cont.getId() == id) {
				it.remove();
				System.out.println("removi id: " + id);
			}
		}
	}
	
	public Contato buscaContatoPeloId(Integer id) {

		for (Contato contato : lista) {
			if(contato.getId() == id) {
				return contato;
			}
		}
		return null;
		
	}


	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;				
			}
		}
		return null;
	}
}
