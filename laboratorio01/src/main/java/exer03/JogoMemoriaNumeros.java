package exer03;

import java.util.ArrayList;

public class JogoMemoriaNumeros extends JogoMemoria {

	@Override
	protected ArrayList<String> tiposCaracters() {
		ArrayList<String> retorno = new ArrayList<String>();
		retorno.add("1");
		retorno.add("2");
		retorno.add("3");
		retorno.add("4");
		retorno.add("5");
		retorno.add("6");
		retorno.add("7");
		retorno.add("8");		
		
		return retorno;
	}

}
