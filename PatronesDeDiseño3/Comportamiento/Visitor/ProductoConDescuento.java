package Visitor;

public class ProductoConDescuento implements Visitable{
	private double precio;
	
	@Override
	public double aceptar(Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
