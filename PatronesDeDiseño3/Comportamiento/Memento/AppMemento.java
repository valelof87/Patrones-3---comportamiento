package Memento;

public class AppMemento {

	public static void main(String[] args) {
		CaraTaker carataker = new CaraTaker();
		
		Persona p = new Persona();
		p.setNombre("juan");
		p.setNombre("maxi");
		
		carataker.addMemento(p.saveToMemento());
		
		p.setNombre("pedro");
		
		carataker.addMemento(p.saveToMemento());
		p.setNombre("julio");
		
		Memento m1 = carataker.getMemento(0);
		Memento m2 = carataker.getMemento(1);
		
		System.out.println(m1.getSaveEstado());
		System.out.println(m2.getSaveEstado());

	}

}
