package br.com.puds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Banco {

	private static List<Contato> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Contato contato = new Contato();
		contato.setId(chaveSequencial++);
		contato.setNome("Puds");
		contato.setEmail("pudinho09@gmail.com");
		contato.setTelefone("61981728275");
		contato.setMensagem("Oi, meu nome é Puds");
		contato.setId(chaveSequencial++);
		
		Contato contato2 = new Contato();
		contato2.setId(chaveSequencial++);
		contato2.setNome("Pedro");
		contato2.setEmail("ph.pedro09@gmail.com");
		contato2.setTelefone("40028922");
		contato2.setMensagem("Oi, meu nome é Pedro");
		contato2.setId(chaveSequencial++);

		lista.add(contato);
		lista.add(contato2);		
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
}
