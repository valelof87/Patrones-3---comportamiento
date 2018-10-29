package State;

public class Mantenimiento implements Estado {

	@Override
	public void ejecutarAccion() {
		System.out.println("se encuentra en mantenimiento: no atento");
		System.out.println("enviar correo par informar estado");
		
	}

}
