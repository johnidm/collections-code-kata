package br.com.johnidouglas.sample.jpa.TestDAO;

import br.com.johnidouglas.sample.jpa.DAO.PessoaDAO;
import br.com.johnidouglas.sample.jpa.models.Pessoa;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PessoaDAOTeste {

    public static void main(String[] args) {

       
        System.out.println("ola");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Johni");
        Calendar data = new GregorianCalendar();
        data.set(Calendar.YEAR, 1983);
        data.set(Calendar.MONTH, 11);
        data.set(Calendar.DAY_OF_MONTH, 26);
        pessoa.setDataNascimento(data.getTime());
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
