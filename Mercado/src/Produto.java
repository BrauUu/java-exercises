
public class Produto {
	
	public float custo = 0;
	public float precoVenda;
	
	public void setCusto(float custo) {
		if(this.custo < custo) {
			this.custo = custo;
			setPrecoVenda(custo * 1.05f);
		}
	}
	
	public void setPrecoVenda(float preco) {
		this.precoVenda = preco;
	}
	
	public float getCusto() {
		return this.custo;
	}
	
	public float getPrecoVenda() {
		return this.precoVenda;
	}

}
