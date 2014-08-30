package exer01;

public class CalculadoraComplexa extends CalculadoraBasica {
	
	public int elevarAoQuadrato(int a) {
		return multiplicao(a, a);
	}

	public boolean ePar(int a) {
		return modulo(a, 2) == 0;
	}
	
	public boolean eImpar(int a) {
		return modulo(a, 2) != 0; 
	}
	
	public int elevarAPotencia(int a, int b) {
		
		int potencia = 1;
		
		for (int i = 1; i <= b; i++ ) {
			potencia = multiplicao(potencia, a); 
		}			
		return potencia;	
	}
	
	public boolean ePrimo(int a) {
		
		boolean primo = true;
		
		if ((a == 0) || (a == 1)) primo = false;
		
		if (primo == false) return false; 	
				
		for (int i = 2; i < a; i++) {
			if (modulo(a, i) == 0) primo = false;
			
			if (primo == false) return false;						
		}
		
		return primo;				
	}
	
}
