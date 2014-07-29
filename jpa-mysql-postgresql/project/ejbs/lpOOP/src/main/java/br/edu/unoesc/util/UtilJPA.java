package br.edu.unoesc.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UtilJPA {
	
	public static EntityManagerFactory entityManagerFactory;  
    public static EntityManager entityManager;  
    public static EntityTransaction transaction;  
      
    static {  
        entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");  
        entityManager = entityManagerFactory.createEntityManager();  
        transaction = entityManager.getTransaction();  
    }
    
	
}
