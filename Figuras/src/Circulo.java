
public class Circulo {
	
	private Ponto meio;
	private double raio;
	
	public Circulo(double raio) {
		meio = new Ponto();
		this.raio = raio;
	}
	
	public Circulo(Ponto ponto) {
		meio = new Ponto();
		this.meio.x = ponto.x;
		this.meio.y = ponto.y;
	}
	
	public Circulo(int x, int y) {
		meio = new Ponto();
		this.meio.x = x;
		this.meio.y = y;
	}
	
	public String getMeio() {
		return "(" + meio.x + "," + meio.y + ")";
	}

}
