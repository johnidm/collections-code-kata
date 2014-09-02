package br.com.johnidouglas.crud.jpa.DAO;

import br.com.johnidouglas.crud.jpa.modelo.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PessoaDAO {

    private EntityManager getEntityManager() {

        EntityManagerFactory factory = null;
        EntityManager entityManager = null;
        
        try {
            //Obtém o factory a partir da unidade de persistência.
            factory = Persistence.createEntityManagerFactory("crud.hibenate");
            //factory = Persistence.createEntityManagerFactory("crud.hibenate");
            //factory = Persistence.createEntityManagerFactory("crud.datanucleus");
            //factory = Persistence.createEntityManagerFactory("crud.openjpa");
            //factory = Persistence.createEntityManagerFactory("crud.objectdb");
            
            //Cria um entity manager.
            entityManager = factory.createEntityManager();
            //Fecha o factory para liberar os recursos utilizado.
        
        } catch (Exception e) {
           System.err.println(e.getMessage());
        }
        return entityManager;
    }

    public void salvar(Pessoa pessoa) {

        EntityManager entityManager = getEntityManager();
        try {
            // Inicia uma transação com o banco de dados.
            entityManager.getTransaction().begin();

            // Verifica se a pessoa ainda não está salva no banco de dados.
            if (pessoa.getId() == null) {
                //Salva os dados da pessoa.
                entityManager.persist(pessoa);
            } else {
                //Atualiza os dados da pessoa.
                pessoa = entityManager.merge(pessoa);
            }
            // Finaliza a transação.
            entityManager.getTransaction().commit();
            
        } catch (Exception e) {      
             e.printStackTrace();                          
        } finally {
            entityManager.close();
        }

        // TODO Quando ocorrer exeção executar um roolback
    }

    public void excluir(Long id) {

        EntityManager entityManager = getEntityManager();
        try {
            // Inicia uma transação com o banco de dados.
            entityManager.getTransaction().begin();
            // Consulta a pessoa na base de dados através do seu ID.
            Pessoa pessoa = entityManager.find(Pessoa.class, id);

            // Remove a pessoa da base de dados.
            entityManager.remove(pessoa);
            // Finaliza a transação.
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }

    }

    public Pessoa pesquisar(Long id) {

        EntityManager entityManager = getEntityManager();
        Pessoa pessoa = null;
        try {
            //Consulta uma pessoa pelo seu ID.
            pessoa = entityManager.find(Pessoa.class, id);
        } finally {
            entityManager.close();
        }
        
        return pessoa;
    }

}
