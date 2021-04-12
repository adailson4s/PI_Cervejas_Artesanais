package dao;

import javax.persistence.*;

public class ConnectionFactory {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("bierbuchdb");
	public static void oi() {
		System.out.println("xqdl");
	}
// getConnection
	public static EntityManager getEntityManager() {

		return emf.createEntityManager();

	}

}
