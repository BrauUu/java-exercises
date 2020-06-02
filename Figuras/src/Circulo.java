
public class Circulo extends Figura{
	
	private Ponto meio;
	private double raio;
	
	public Circulo(double raio) {
		super();
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
	
	public void calculaArea() {
		this.area = Math.PI *  Math.pow(raio, 2);
	}

}
