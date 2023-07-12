package main.java.fr.m2i.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.Order;



public class ProductManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();
			
			Order o = em.find(Order.class, 1);
			System.out.println(o);
			System.out.println(o.getProduct());
			
			System.out.println("-----------------------------");
			
			Order o2 = em.find(Order.class, 2);
			System.out.println(o2);
			System.out.println(o2.getProduct());
			
			
			
			
			
		} finally {
			if (emf != null)
				emf.close();
			
			if (em != null)
				em.close();
		}
		
		
		
		
	}
	
	
}
