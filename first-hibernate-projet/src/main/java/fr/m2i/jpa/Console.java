package main.java.fr.m2i.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.User;


public class Console {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();
			
			
			// GET BY ID
//			User u = em.find(User.class, 1);
//			System.out.println(u);
			
			// GET ALL
			List<User> users = em.createQuery("From User").getResultList();
			for (User user : users) {
				System.out.println(user);
			}
			
			// CREATE
//			EntityTransaction trans = em.getTransaction();
//			trans.begin();
//			User u = new User("Toto", "Tata", 150);
//			em.persist(u);
//			trans.commit();
		
			// UPDATE
//			User u = em.find(User.class, 2);
//
//			EntityTransaction trans = em.getTransaction();
//			trans.begin();
//			u.setAge(9999);
//			trans.commit();
			
			// DELETE
//			User u = em.find(User.class, 1);
//			
//			EntityTransaction trans = em.getTransaction();
//			trans.begin();
//			
//			em.remove(u);
//			
//			trans.commit();
			
			
			
			
		} finally {
			if (emf != null)
				emf.close();
			if (em != null)
				em.close();
		}
	}
}