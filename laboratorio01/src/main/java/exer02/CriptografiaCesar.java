package exer02;

public class CriptografiaCesar implements Criptografia {

	public String execute(String texto, Integer index) {
		
		StringBuilder cifra = new StringBuilder();
				
		for (char c : texto.toCharArray()) {            
			cifra.append( (char)( c + index) );            
        }        
		
        return cifra.toString();		
	}
	
	public String criptografar(String texto) {
		return execute(texto, 3);        
	}

	public String descriptografar(String texto) {
		
		return execute(texto, -3);       
	}
	
	
	

}
