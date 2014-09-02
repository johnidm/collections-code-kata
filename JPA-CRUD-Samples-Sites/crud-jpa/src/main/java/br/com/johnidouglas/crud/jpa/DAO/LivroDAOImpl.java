package br.com.johnidouglas.crud.jpa.DAO;

import br.com.johnidouglas.crud.jpa.modelo.Livro;
import br.com.johnidouglas.crud.jpa.util.HibernateUtil;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

public class LivroDAOImpl implements LivroDAO {

    public void save(Livro livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = (Transaction) session.beginTransaction();
        session.save(livro);
        //t.commit();    
    }

    public Livro getLivro(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Livro) session.load(Livro.class, id);
    }

    public List<Livro> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = (Transaction) session.beginTransaction();
        List lista = session.createQuery("from Livro").list();
        //t.commit();
        return lista;
    }

    public void remove(Livro livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = (Transaction) session.beginTransaction();
        session.delete(livro);
        //t.commit();
    }

    public void update(Livro livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = (Transaction) session.beginTransaction();
        session.update(livro);
        //t.commit();
    }

}
