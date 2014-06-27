package br.com.johnidouglas.crud.jpa.TesteDAO;

import br.com.johnidouglas.crud.jpa.DAO.PessoaDAO;
import br.com.johnidouglas.crud.jpa.modelo.Pessoa;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PessoaDAOTeste {

    public static void main(String[] args) {

       
        System.out.println("ola");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Johni");
     
        pessoa.setEmail("johni@johni.br");
            

        PessoaDAO dao = new PessoaDAO();
        System.out.println("Salvando a pessoa: " + pessoa.getNome());
        dao.salvar(pessoa);
        
          /*
        Pessoa pessoa2 = dao.pesquisar(pessoa.getId());
        System.out.println("Consultando: " + pessoa2.getNome());

        
        System.out.println("Removendo a pessoa: " + pessoa.getId());
        dao.excluir(pessoa.getId());
                */
    }
}
