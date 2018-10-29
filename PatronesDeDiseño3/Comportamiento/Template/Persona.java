package Template;

public abstract class Persona {
	private String nombre;
	private String DNI;
	
	public String identificate() {
		String frase = "Me identifico como ";
		frase = frase + getTipoId();
		frase = frase + " numero  ";
		frase = frase + getIdentificacion();
		return frase;
	}
	// ESQUELETO DE LOS METODOS QUE LAS SUBCLASES DEBEN IMPLEMENTAR
	protected abstract String getTipoId();
	protected abstract String getIdentificacion();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	
}
