package Visitor;

public interface Visitor {
	
	public double visit(ProductoNormal normal);
	public double visit(ProductoConDescuento reducido);
}
