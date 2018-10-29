package Template;

public class Socio extends Persona{
	private int nroSocio;
	
	public Socio(int nroSocio) {
		setNroSocio(nroSocio);
	}
	
	@Override
	protected String getTipoId() {
		
		return " Socio,  ";
	}

	@Override
	protected String getIdentificacion() {
		
		return String.valueOf(nroSocio);
	}

	public int getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(int nroSocio) {
		this.nroSocio = nroSocio;
	}
	

}
