package Strategy;

public class AppEstrategy {

	public static void main(String[] args) {
		AvionComercial avionComercial = new AvionComercial();
		AvionRapido avionRapido = new AvionRapido();
		
		System.out.println("Avion Comercial");
		avionComercial.setAlgoritmo(new EnTierra());
		avionComercial.mover();
		avionComercial.setAlgoritmo(new EnAire());
		avionComercial.mover();
		System.out.println();
		
		System.out.println("Avion Rapido");
		avionRapido.setAlgoritmo(new EnTierra());
		avionRapido.mover();
		avionRapido.setAlgoritmo(new EnAireVeloz());
		avionRapido.mover();
		System.out.println();
		
		System.out.println("Avion comercial Rapido");
		avionRapido.setAlgoritmo(new EnAireVeloz());
		avionRapido.mover();
		System.out.println();

	}

}
