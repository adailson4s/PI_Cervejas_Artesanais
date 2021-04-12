package main;


import javax.persistence.*;

import classes.Apreciador;
import dao.ConnectionFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Apreciador apreciador = new Apreciador(1, "Brama");
	
		try {			
			EntityManager connection = ConnectionFactory.getEntityManager();		
			connection.getTransaction().begin();
			connection.persist(apreciador);
			connection.getTransaction().commit();			
		} catch(Exception e) {
			throw new Exception("Erro gravando Grupo: "+ e.getMessage());
		}
		System.out.println("Deu boa");
//		
//		EntityManager connection = ConnectionFactory.getEntityManager();
//		
//		Query q = connection.createQuery("select g from Grupo g");
//		System.out.println(q.getResultList();
		
	}

}
