
public class ListaDuplamenteEncadeada{
	
	public NodeD cabeca;
	public NodeD cauda;
	
	public ListaDuplamenteEncadeada() {
		this.cauda = null;
		this.cabeca = null;
	}
	
	public void insereInicio(int valor) {
		if(cabeca == null) {
			cabeca = cauda = new NodeD(valor,null,null);
		}
		else {
			cabeca = new NodeD(valor,cabeca,null);
			(cabeca.proximo).anterior = cabeca;
		}
	}
	
	public void insereOrdenado(int valor) {
		if(cabeca == null) {
			cabeca = cauda = new NodeD(valor,null,null);
		}
		else if(cabeca.valor >= valor) {
			insereInicio(valor);
		}
		else if(cauda.valor <= valor) {
			insereFim(valor);
		}
		else {
			NodeD corrente = cabeca;
			while(corrente.valor < valor) {
				corrente = corrente.proximo;
			}
			corrente = new NodeD(valor,corrente.proximo,corrente.anterior);
			corrente.proximo.anterior = corrente;
			corrente.anterior.proximo = corrente;
		}
	}
	
	public void insereFim(int valor) {
		if(cabeca == null) {
			cabeca = cauda = new NodeD(valor,null,null);
		}
		else {
			cauda = new NodeD(valor,null,cauda);
			(cauda.anterior).proximo = cauda;
		}
	}
	
	public void insereSegundo(int valor) {
		if (cabeca == null) {
			System.out.println("Lista vazia");
		}
		else if(cabeca == cauda) {
			insereFim(valor);
		}
		else {
			NodeD segundo = new NodeD(valor,cabeca.proximo,cabeca);
			cabeca.proximo = segundo;
			(segundo.proximo).anterior = segundo;
		}
	}
	
	public void insereTerceiro(int valor) {
		if(cabeca == null) {
			System.out.println("Lista vazia");
		}
		if(cabeca == cauda) {
			System.out.println("Lista de apenas um elemento");
		}
		else {
			NodeD corrente = new NodeD(valor, cabeca.proximo.proximo, cabeca.proximo);
			corrente.anterior.proximo = corrente;
			corrente.proximo.anterior = corrente;
			
		}	
	}
	
	public void inserePenultimo(int valor) {
		
	}
	
	public int removePenultimo() {
		NodeD penultimo = cauda.anterior;
		(penultimo.anterior).proximo = cauda;
		cauda.anterior = cauda.anterior.anterior;
		return penultimo.valor;
	}
	
	public void imprimeInicio() {
		NodeD corrente = cabeca;
		if(corrente == null) {
			System.out.println("Lista Vazia");
		}
		else while (corrente != null) {     
			if(corrente.proximo == cabeca) break;
			System.out.print(corrente.valor + " , ");            
			corrente = corrente.proximo;         
		}
		System.out.print("\n");
	}
	
	public void imprimeFim() {
		NodeD corrente = cauda;
		if(corrente == null) {
			System.out.println("Lista Vazia");
		}else while (corrente != null) {
			if( corrente.anterior == cauda) break;
			System.out.print(corrente.valor + " , ");
			corrente = corrente.anterior;
		}
		System.out.println("\n");
	}

}
