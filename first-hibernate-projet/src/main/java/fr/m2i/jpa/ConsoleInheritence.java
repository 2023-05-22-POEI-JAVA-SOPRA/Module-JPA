package main.java.fr.m2i.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.fr.m2i.jpa.entity.Document;
import main.java.fr.m2i.jpa.entity.Livre;

public class ConsoleInheritence {

	

	
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("maConfiguration");
			em = emf.createEntityManager();
			
			List<Document> documents = em.createQuery("From Document", Document.class).getResultList();
			
			
			for (Document document : documents) {
				System.out.println("=======================");
				System.out.println(document.getClass().getName());
				System.out.println(document);
			}
			
			System.out.println("=============");
			
			Livre t = em.find(Livre.class, 2);
			System.out.println(t);
			
			
		} finally {
			if (emf != null)
				emf.close();
			if (em != null)
				em.close();
		}
	}
	
}
