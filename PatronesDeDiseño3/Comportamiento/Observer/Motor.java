package Observer;


//OBSERVADOR
public class Motor implements Observador {

	public Motor() {}
	
	//ACCION QUE SE EJECUTA CUANDO EL ACELERADOR LO NOTIFICA
	@Override
	public void update() {
		System.out.println("subir la velocidad");
		
	}

}
