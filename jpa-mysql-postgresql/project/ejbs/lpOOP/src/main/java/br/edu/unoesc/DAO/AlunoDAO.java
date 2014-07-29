package br.edu.unoesc.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unoesc.modelos.Aluno;

public class AlunoDAO {

	private EntityManager getEntityManager() {

		EntityManagerFactory factory = null;
		EntityManager entityManager = null;

		try {						
			
			//factory = Persistence.createEntityManagerFactory("lpOOP-eclipselink.mysql");
			//factory = Persistence.createEntityManagerFactory("lpOOP.hibenate.mysql");
			
			//factory = Persistence.createEntityManagerFactory("lpOOP.hibernate.postgresql");
			factory = Persistence.createEntityManagerFactory("lpOOP.eclipselink.postgresql");			
			
			entityManager = factory.createEntityManager();		
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return entityManager;
	}

	public void salvar(Aluno aluno) {

		EntityManager entityManager = getEntityManager();
		try {			
			entityManager.getTransaction().begin();
			
			if (aluno.getId() == null) {				
				entityManager.persist(aluno);
			} else {				
				aluno = entityManager.merge(aluno);
			}			
			entityManager.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
	}

}
