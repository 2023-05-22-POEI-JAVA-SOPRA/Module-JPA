package main.java.fr.m2i.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.CreditCard;
import main.java.fr.m2i.jpa.entity.User;
import main.java.fr.m2i.jpa.entity.UserDetails;

public class ConsoleOneToMany {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();
			
			User u = em.find(User.class, 1);
			
			System.out.println(u);
			
			for (CreditCard cc : u.getCreditCards()) {
				System.out.println(cc);
			}
			
			
		} finally {
			if (emf != null)
				emf.close();
			
			if (em != null)
				em.close();
		}
	}
		
		
}
