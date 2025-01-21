package teste.umpraum;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Killua", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		//Isso daria errado pois assento não estava sendo pesistido, adicionando na classe cliente uma anotação de cascade o Assento sempre será pesistido
		dao.incluirAtomico(cliente);
	}
}
