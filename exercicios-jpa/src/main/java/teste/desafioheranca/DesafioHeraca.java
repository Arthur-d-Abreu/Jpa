package teste.desafioheranca;

import infra.DAO;
import modelo.desafioHeranca.Gerente;

public class DesafioHeraca {
	public static void main(String[] args) {
		
		DAO<Gerente> dao = new DAO<Gerente>();
		
		Gerente gerente = new Gerente("Roberto", "roberto@gmail.com", "1234");
		
		dao.incluirAtomico(gerente);
	}
}
