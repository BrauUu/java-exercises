
public class Main {

	public static void main(String[] args) {
	
		Ponto ponto = new Ponto(1,2);
		Circulo circ = new Circulo(ponto);
		
		System.out.println(circ.getMeio());

	}

}
