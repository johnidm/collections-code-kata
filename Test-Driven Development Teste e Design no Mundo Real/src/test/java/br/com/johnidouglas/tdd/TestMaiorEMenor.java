package br.com.johnidouglas.tdd;

import org.junit.Test;

import junit.framework.Assert;

public class TestMaiorEMenor {

	
	@Test
	public void ordemDecrescente() 
	{
		// cenário
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona( new Produto( "Geladeira", 450.00 ) );
		carrinho.adiciona( new Produto( "Liquidificador", 250.00 ) );
		carrinho.adiciona( new Produto( "Chaleira", 70.00 ) );
		
		// ação
		MaiorEMenor acao = new MaiorEMenor();
		acao.encontra(carrinho);
		
		// validação
		Assert.assertEquals( "Chaleira" , acao.getMenor().getDescricao() );
		Assert.assertEquals( "Geladeira" , acao.getMaior().getDescricao() );
				
	}
	
	
	@Test
	public void apenasUmProduto()
	{
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona( new Produto(  "Chaleira" ,  450.0 ) );
		
		MaiorEMenor acao = new MaiorEMenor();
		acao.encontra(carrinho);
		
		Assert.assertEquals( "Chaleira" , acao.getMaior().getDescricao() );
		Assert.assertEquals( "Chaleira" , acao.getMenor().getDescricao() );
		
	}
	
	
}
