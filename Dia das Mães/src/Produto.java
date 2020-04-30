public class Produto {
	
	private float altura, largura, profundidade;
	private float preco, peso;
	
	public Produto() {
		
	}
	
	public Produto(float altura, float largura, float profundidade, float preco, float peso) {
		this.setCubagem(altura, largura, profundidade);
		this.setPreco(preco);
		this.setPeso(peso);
	}
	
	public void setPreco (float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public void setPeso (float peso) {
		this.peso = peso;
	}
	
	public float getPeso() {
		return this.peso;
	} 

	public void setCubagem(float altura,float larg, float profundidade) {
		this.altura = altura;
		this.largura = larg;
		this.profundidade = profundidade;

	}
	
	public String getCubagem() {
		String cubagem = String.valueOf(altura) + "x" + String.valueOf(largura) + "x" + String.valueOf(profundidade);
		return cubagem;
	}
}
