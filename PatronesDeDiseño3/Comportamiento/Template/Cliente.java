package Template;

public class Cliente extends Persona {
	private int numeroCliente;
	
	public Cliente(int numeroCliente) {
		setNumeroCliente(numeroCliente);
	}
	

	@Override
	protected String getTipoId() {
		
		return "Cliente, ";
	}

	@Override
	protected String getIdentificacion() {
		
		return String.valueOf(numeroCliente);
	}


	public int getNumeroCliente() {
		return numeroCliente;
	}


	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	
}
