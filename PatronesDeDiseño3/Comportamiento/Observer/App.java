package Observer;

public class App {

	public static void main(String[] args) {
		Motor v8 = new Motor();
		Acelerador ac = new Acelerador();
		
		ac.addObservador(v8); // SE ENLAZAN
		
		ac.pisarElAcelerador();
		

	}

}
