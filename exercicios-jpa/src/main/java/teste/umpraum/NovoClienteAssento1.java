package teste.umpraum;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAssento1 {
	public static void main(String[] args) {
		
		Assento assento = new Assento("3C");
		Cliente cliente = new Cliente("Gon", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		.incluir(assento)
		.incluir(cliente)
		.fecharT()
		.fechar();
		
	}
}
