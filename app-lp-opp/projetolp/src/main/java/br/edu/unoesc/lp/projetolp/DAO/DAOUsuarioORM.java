package br.edu.unoesc.lp.projetolp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unoesc.lp.projetolp.modelos.Usuario;

public class DAOUsuarioORM implements DAOUsuario {
	
	private EntityManager entityManager; 
		
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = null;
		EntityManager entity = null;

		try {					
			factory = Persistence.createEntityManagerFactory("lpOOP.eclipselink.postgresql");			
			
			entity = factory.createEntityManager();		
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return entity;
	}	
	
	public DAOUsuarioORM() {
		entityManager = getEntityManager();
	}	
	
	@Override
	public void salvar(Usuario usuario) {
			
		try {			
			entityManager.getTransaction().begin();
			
			if (usuario.getId() == null) {				
				entityManager.persist(usuario);
			} else {				
				usuario = entityManager.merge(usuario);
			}			
			entityManager.getTransaction().commit();

		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
	}

	@Override
	public void excluir(Usuario usuario) {
		
		
	}

	@Override
	public List<Usuario> listar() {
		
		return null;
	}

	@Override
	public Usuario pesquisar(String nome) {
		
		return null;
	}
	
	

}
