package main.java.fr.m2i.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.Product;
import main.java.fr.m2i.jpa.entity.Shop;

public class ProductManyToMany {

	
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();

//			Product p = em.find(Product.class, 1);
//			
//			System.out.println(p);
//			System.out.println(p.getShops());
//			
			
			Shop s = em.find(Shop.class, 1);
			
			System.out.println(s);
			System.out.println(s.getProducts());
			
		} finally {
			if (emf != null)
				emf.close();
			if (em != null)
				em.close();
		}
	}
	
	
}
