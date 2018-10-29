package Visitor;

public class ProductoNormal implements Visitable {
private double precio;
	
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
