
public class NodeD {
	
	public NodeD anterior;
	public int valor;
	public NodeD proximo;
	
	public NodeD(int valor) {
		this.proximo = null;
		this.anterior = null;
		this.valor = valor;
	}
	
	public NodeD(int valor, NodeD prox, NodeD ant) {
		this.proximo = prox;
		this.anterior = ant;
		this.valor = valor;

	}

}
