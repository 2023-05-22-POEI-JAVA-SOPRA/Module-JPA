package main.java.fr.m2i.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.Role;
import main.java.fr.m2i.jpa.entity.User;

public class ConsoleManyToMany {

	
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();
			
//			User u = em.find(User.class, 2);
//			
//			System.out.println(u);
//			
//			System.out.println(u.getRoles());

			
			Role r = em.find(Role.class, 1);
			
			System.out.println(r);
			System.out.println(r.getUsers());
			
			
			
		} finally {
			if (emf != null)
				emf.close();
			if (em != null)
				em.close();
		}
	}
	
	
}
