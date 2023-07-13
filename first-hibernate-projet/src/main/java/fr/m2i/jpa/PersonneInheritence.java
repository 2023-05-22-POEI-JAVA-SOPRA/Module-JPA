package main.java.fr.m2i.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.Etudiant;
import main.java.fr.m2i.jpa.entity.Personne;
import main.java.fr.m2i.jpa.entity.User;
import main.java.fr.m2i.jpa.entity.UserDetails;

public class PersonneInheritence {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();
			
			Personne p = em.find(Personne.class, 2);
			Etudiant e = em.find(Etudiant.class, 1);
			
			
			System.out.println(e);
			
			System.out.println(p);
			System.out.println(p.getClass().getName());
			
			
		} finally {
			if (emf != null)
				emf.close();
			
			if (em != null)
				em.close();
		}
		
	}
}
