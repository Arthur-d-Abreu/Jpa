package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager(); 
		
		em.getTransaction().begin();
		
		
		
		Usuario usuario = em.find(Usuario.class, 4L);
		usuario.setNome("Leorio Alterado");
		//Qualquer mudança que você fizer no Objeto o jpa vai sicronizar essa mudança com o banco de dados
		//mesmo que o "merge" esteja comentando pois o objeto está no estado GERENCIADO
		
		//em.merge(usuario);
		
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}
}
