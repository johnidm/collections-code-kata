package br.edu.unoesc.lp.projetolp.DAO;

import java.util.List;

import br.edu.unoesc.lp.projetolp.modelos.Usuario;

public interface DAOUsuario {
	
	public void salvar (Usuario usuario);    
	public void excluir (Usuario usuario);    
	public List<Usuario> listar ();    
	public Usuario pesquisar (String nome);

}
