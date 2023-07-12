package main.java.fr.m2i.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.User;
import main.java.fr.m2i.jpa.entity.UserDetails;

public class ConsoleOneToOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();
			
//			
//			UserDetails ud = em.find(UserDetails.class, 1);
//			
//			System.out.println(ud);
//			
//			
//			User u = ud.getUser();
//			
//			System.out.println(u);
			
			User u = em.find(User.class, 1);
			
			System.out.println(u);
			
			UserDetails ud = u.getUserDetails();
			
			System.out.println(ud);
			
			
		} finally {
			if (emf != null)
				emf.close();
			
			if (em != null)
				em.close();
		}
		
		
		
		
	}
	
	
}
