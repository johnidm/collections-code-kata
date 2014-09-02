package br.com.johnidouglas.crud.jpa.DAO;

import br.com.johnidouglas.crud.jpa.modelo.Livro;

import java.util.List;

public interface LivroDAO {

    public void save(Livro livro);

    public Livro getLivro(long id);

    public List<Livro> list();

    public void remove(Livro livro);

    public void update(Livro livro);

}
