package br.edu.unoesc.Main;

import br.edu.unoesc.DAO.AlunoDAO;
import br.edu.unoesc.modelos.Aluno;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Criando o aluno");
		Aluno aluno = new Aluno();		
		aluno.setNome("Fulano");
		
		System.out.println("Criando o DAO");
		AlunoDAO dao  = new AlunoDAO();
		
		
		System.out.println("Salvando aluno");
		dao.salvar(aluno);			
			

	}

}
