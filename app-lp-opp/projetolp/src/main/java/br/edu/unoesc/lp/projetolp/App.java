package br.edu.unoesc.lp.projetolp;

import br.edu.unoesc.lp.projetolp.DAO.DAOUsuario;
import br.edu.unoesc.lp.projetolp.DAO.DAOUsuarioORM;
import br.edu.unoesc.lp.projetolp.modelos.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	DAOUsuario dao = new DAOUsuarioORM();
    	
    	Usuario usuario = new Usuario();
    	usuario.setId(1);
    	usuario.setNome("Johni");    	
    	
    	
    	
		dao.salvar(usuario);
    	
    	
    	
    }
}
