package br.edu.ifsp.lpl2.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FaculdadePU");

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	public static void close() {
		entityManagerFactory.close();
	}
	
	
	
}
