package State;

import java.util.Scanner;

public class AppStrategy {
	public static void main(String[] args) {
	Alarma alarma = new Alarma();
	Activada activada = new Activada();
	Mantenimiento mantenimiento = new Mantenimiento();
	
	int opcion = 0;
	
	Scanner sc = new Scanner(System.in);
	
	do{
		muestraMenu();
		opcion = sc.nextInt();
		switch(opcion){
		case 1:
				alarma.setEstado(activada);
				break;
			case 2:
				alarma.setEstado(mantenimiento);
				break;
			case 0:
				System.exit(0);
				default:
					System.out.println("opcion errada");
		}
		alarma.ejecutarAccion();
	} while(opcion!= 0);
}
		
		
		private static void muestraMenu() {
			StringBuffer menu = new StringBuffer();
			menu.append("*********\n");
			menu.append("*seleccione el estado de la alarma   *********\n");
			menu.append("* 1 activada. 2 mantenimoento. 0 salir *******\n");
			menu.append("*********\n");
			System.out.println(menu.toString());
			
	}
}
