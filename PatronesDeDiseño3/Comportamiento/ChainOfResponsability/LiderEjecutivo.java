package ChainOfResponsability;

public class LiderEjecutivo  implements IAprobador{
	private IAprobador next;

	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}

	@Override
	public IAprobador getNext() {
		
		return next;
	}

	@Override
	public void solicitudPrestamo(int monto) {
		if(monto > 10000 && monto < 50000) {
			System.out.println("Lo manejo yo, el lider ejecutivo ");
		}else {
			next.solicitudPrestamo(monto);
		}
			
		
	}
	
}
