public class Node {

	public int valor;
	public Node proximo;
	
	public Node(int valor) {
		this.valor = valor;
		this.proximo = null;
	}
	
	public Node(int valor, Node proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void setProximo(Node prox) {
		this.proximo = prox;
	}
	
	public int getValor() {
		return valor;
	}
	
	public Node getProximo() {
		return proximo;
	}
	
}
