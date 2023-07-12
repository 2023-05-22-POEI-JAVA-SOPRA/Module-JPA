package main.java.fr.m2i.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.Product;
import main.java.fr.m2i.jpa.entity.ProductDetails;

public class ProductOneToOne {

	
	
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();

//			ProductDetails proDetails = em.find(ProductDetails.class, 2);
//			System.out.println(proDetails);
//			
//			Product p = proDetails.getProduct(); 
//			System.out.println(p);
//			
			
			Product p = em.find(Product.class, 3);
			ProductDetails proD = p.getProductDetails();
			
			System.out.println(p);
			System.out.println(proD);
			
			
			
		} finally {
			if (emf != null)
				emf.close();
			
			if (em != null)
				em.close();
		}
	}
}
