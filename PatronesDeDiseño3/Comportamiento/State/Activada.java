package State;

public class Activada implements Estado {

	@Override
	public void ejecutarAccion() {
		System.out.println("Alarma activada: atento");
		
	}

}
