package main.java.fr.m2i.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.CreditCard;
import main.java.fr.m2i.jpa.entity.User;
import main.java.fr.m2i.jpa.entity.UserDetails;

public class ConsoleManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();
			
			CreditCard cc = em.find(CreditCard.class, 1);
			System.out.println(cc);
			
			User u = cc.getUser();
			System.out.println(u);
			
			System.out.println("========================");
			
			CreditCard cc2 = em.find(CreditCard.class, 2);
			System.out.println(cc2);
			
			System.out.println( cc2.getUser());
			
			
			
		} finally {
			if (emf != null)
				emf.close();
			
			if (em != null)
				em.close();
		}
	}
		
		
}
