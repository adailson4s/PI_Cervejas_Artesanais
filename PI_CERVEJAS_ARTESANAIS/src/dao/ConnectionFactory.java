package dao;

import javax.persistence.*;

public class ConnectionFactory {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("bierbuchdb");

// getConnection
	public static EntityManager getEntityManager() {

		return emf.createEntityManager();

	}

}
