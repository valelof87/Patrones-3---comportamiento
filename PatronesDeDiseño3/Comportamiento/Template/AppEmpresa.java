package Template;

public class AppEmpresa {

	public static void main(String[] args) {
		Persona p = new Cliente( 1234);
		System.out.println(p.identificate());
		
		p= new Empleado("venta 002");
		System.out.println(p.identificate());
		
		p = new Socio (12);
		System.out.println(p.identificate());

	}

}
