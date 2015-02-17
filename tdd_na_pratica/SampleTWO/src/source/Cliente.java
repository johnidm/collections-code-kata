package source;

public class Cliente implements AlugaCarro {

	private String nomeCliente;
	private String modeloCarro;
	
	@Override
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		
	}

	@Override
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
		
	}

	@Override
	public String getNomeCliente() {
		return nomeCliente;
	}

	@Override
	public String getModeloCarro() {
		
		return modeloCarro;
	}

}
