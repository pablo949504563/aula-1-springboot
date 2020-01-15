package jpaaula.aplicacao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaaula.dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		/*
		Pessoa p1 = new Pessoa(null, "Pablo Gonzalez", "pablo@gmail.com");
		Pessoa p2 = new Pessoa(null, "Agenor Barbosa", "agenor@gmail.com");
		Pessoa p3 = new Pessoa(null, "Magnolia Barbosa", "magnolia@gmail.com");
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		em.close();
		emf.close();
		
		
		/*
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		System.out.println("pronto sistema rodou");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		*/
	}

}
