package Observer;

import java.util.ArrayList;

//OBSERVABLE
public class Acelerador implements Observable {
	private ArrayList<Observador> observadores;
	
	public Acelerador() {
		observadores = new ArrayList<Observador>();
	}
	
	public void addObservador(Observador o) {
		observadores.add(o);
	}
	
	public void pisarElAcelerador() { //ESTE METODO EJECUTA EL EVENTO
		notificar();
	}
	
	@Override
	public void notificar() {
		for(Observador o: observadores) {
			o.update();
		}
		
		
	}

}
