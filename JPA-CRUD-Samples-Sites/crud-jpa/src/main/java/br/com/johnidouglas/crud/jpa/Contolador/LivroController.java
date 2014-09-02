package br.com.johnidouglas.crud.jpa.Contolador;


import br.com.johnidouglas.crud.jpa.DAO.LivroDAO;
import br.com.johnidouglas.crud.jpa.DAO.LivroDAOImpl;
import br.com.johnidouglas.crud.jpa.modelo.Livro;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;


@ManagedBean
@SessionScoped
public class LivroController {

    private Livro livro;
    private DataModel listaLivros;

    public DataModel getListarLivros() {
        LivroDAO dao = new LivroDAOImpl();       
        List<Livro> lista = dao.list();        
        listaLivros = new ListDataModel(lista);
        return listaLivros;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String prepararAdicionarLivro() {
        livro = new Livro();
        return "gerenciarLivro";
    }

    public String prepararAlterarLivro() {
        livro = (Livro) (listaLivros.getRowData());
        return "gerenciarLivro";
    }

    public String excluirLivro() {
        Livro livroTemp = (Livro) (listaLivros.getRowData());
        LivroDAO dao = new LivroDAOImpl();
        dao.remove(livroTemp);
        return "index";
    }

    public String adicionarLivro() {
        LivroDAO dao = new LivroDAOImpl();
        dao.save(livro);
        return "index";
    }

    public String alterarLivro() {
        LivroDAO dao = new LivroDAOImpl();
        dao.update(livro);
        return "index";
    }

    private Object LivroDAOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
