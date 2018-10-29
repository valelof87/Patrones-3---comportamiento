package Visitor;

public class AppVisitor {

	public static void main(String[] args) {
		ProductoConDescuento producto1 = new ProductoConDescuento();
		producto1.setPrecio(100);
		ProductoNormal producto2 = new ProductoNormal();
		producto2.setPrecio(100);
		
		
		Iva iva = new Iva();
		double resultado1 = producto1.aceptar(iva);
		double resultado2 = producto2.aceptar(iva);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		
	}

}
