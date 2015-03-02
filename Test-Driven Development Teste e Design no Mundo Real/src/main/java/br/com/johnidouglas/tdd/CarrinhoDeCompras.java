package br.com.johnidouglas.tdd;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	
	private ArrayList<Produto> produtos; 

	
	
	public CarrinhoDeCompras() {
		produtos = new ArrayList<Produto>();
	}

	
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	
	
	public void adiciona( Produto produto )
	{
		produtos.add( produto );
	}
	
	
	
	
	
}
