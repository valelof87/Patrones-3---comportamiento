package Memento;

public class Memento {
	private String estado;
	
	public Memento(String estado) {
	this.estado = estado;
	}
	
	public String getSaveEstado() {
		return estado;
	}
}
