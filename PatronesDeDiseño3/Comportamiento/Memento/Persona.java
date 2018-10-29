package Memento;

public class Persona {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Memento saveToMemento() {
		System.out.println("Originador: guardando memento...");
		return new Memento(nombre);
	}
	
	public void restaurarMemento(Memento m) {
		m.getSaveEstado();
	}
}
