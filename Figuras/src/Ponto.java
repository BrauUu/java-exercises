
public class Ponto {
	
	int x,y;
	
	public Ponto() {
		this.x = 0;
		this.y = 0;
		
	}
	
	public Ponto(int x) {
		this.x = x;
	}
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getPonto() {
		return "(" + x + "," + y + ")";
	}
	
	public String getPonto(String titulo) {
		return titulo + "\n(" + x + "," + y + ")";
	}
}
