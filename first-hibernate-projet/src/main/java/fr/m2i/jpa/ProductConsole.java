package main.java.fr.m2i.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.Product;

public class ProductConsole {

	
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();
			
			// CREATE
//			EntityTransaction trans = em.getTransaction();
//			trans.begin();
//			
//			Product p = new Product(52, "Spring", "Java", 12.5f);
//			em.persist(p);
//			
//			trans.commit();
			
			// GET BY ID
//			Product p = em.find(Product.class, 4);
//			System.out.println(p);
			
			// GET ALL
			List<Product> products = em.createQuery("From Product").getResultList();
			for (Product product : products) {
				System.out.println(product);
			}
			//UPDATE			
//			Product p = em.find(Product.class, 3);
//			EntityTransaction trans = em.getTransaction();
//			trans.begin();
//			
//			p.setDescription("Une longue description");
//			
//			trans.commit();
			// DELETE
			
//			Product p = em.find(Product.class, 5);
//			
//			EntityTransaction trans = em.getTransaction();
//			trans.begin();
//			
//			em.remove(p);
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
