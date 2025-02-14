package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager(); 
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		//Usando o detach o modo gerenciado de usuario é removido e para haver alteração 
		//é necessario usar o "merge"
		em.detach(usuario);
		usuario.setNome("Leorio");
		
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}
}
