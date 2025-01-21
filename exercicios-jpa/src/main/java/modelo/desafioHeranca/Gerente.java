package modelo.desafioHeranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Gerente")
public class Gerente extends Pessoa {
	
	private String login;
	
	private String senha;
	
	
	public Gerente() {
	}
	
	public Gerente(String nome,String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		
	
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
