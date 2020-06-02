public abstract class Figura {
	
	public String corBorda;
	public String corPreenchimento;
	public double area;
	
	public Figura() {
		this.corBorda = "Preto";
		this.corPreenchimento = "Preto";
	}
	
	public Figura(String corB, String corP) {
		this.corBorda = corB;
		this.corPreenchimento = corP;
	}
	
	public abstract void calculaArea();
	
}
