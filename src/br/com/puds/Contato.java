
package br.com.puds;


public class Contato {

	String nome;
	String email;
	String telefone;
	String mensagem;
	Integer id;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}

	
}
