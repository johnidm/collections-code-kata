package br.edu.unoesc.lp.oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
        System.out.println( "Hello World!" );
        
        Cliente cliente = new Cliente("Fulano de Tal");
        System.out.println( cliente.getNome() );
                
        ClienteEspecial clienteespecial = new ClienteEspecial("Fulano de Tal");
        System.out.println( clienteespecial.getNome() );        
        System.out.println( clienteespecial.getSaldoBonus() );
       
    	
    	Boleto boleto = new Boleto();
    	boleto.imprimir();
    	
    	Boleto boletoBB = new BoletoBancoBrasil();
    	boletoBB.imprimir();
    	
    	
    	Exportar exportar = new ExportarXML();
		exportar.salvar();
		
		Exportar exportar = new ExportarTexto();
		exportar.salvar();
		*/
		    	
    	ContaCorrente contaPoupanca = new ContaCorrentePoupanca();
    	contaPoupanca.deposito(23);
    	System.out.println(contaPoupanca.saldo());
    	
    	
    	ContaCorrente contaPoupancaOuro = new ContaCorrentePoupancaOuro();
    	contaPoupancaOuro.deposito(23);
    	System.out.println(contaPoupancaOuro.saldo());
    	
    	
    	
    }
}
