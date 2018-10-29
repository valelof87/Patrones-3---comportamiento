package Template;

public class Empleado  extends Persona{
	private String legajo;
	
	public Empleado(String legajo) {
		setLegajo(legajo);
	}

	@Override
	protected String getTipoId() {
		
		return "Empleado, legajo ";
	}

	@Override
	protected String getIdentificacion() {
		
		return legajo;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	

}
