package psc.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilJpa {
	private static EntityManagerFactory emf;

	public static void createEntityManagerFactory() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("PSC_JPA");
		}
	}

	public static EntityManager getEntityManager() {
		if (emf == null) {
			createEntityManagerFactory();
		}
		return emf.createEntityManager();
	}

	public static void closeEntityManagerFactory() {
		if (emf != null) {
			emf.close();
		}
	}
}
