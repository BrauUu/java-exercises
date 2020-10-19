
public class ListaCircular {
	public NodeD cabeca;
	public NodeD cauda;
	
	public ListaCircular() {
		this.cauda = null;
		this.cabeca = null;
	}
	
	public void insereInicio(int valor) {
		if(cabeca == null) {
			cabeca = cauda = new NodeD(valor,cabeca,cabeca);
		}
		else {
			cabeca = new NodeD(valor,cabeca,cauda);
			(cabeca.proximo).anterior = cabeca;
		}
	}
	
	public void insereFim(int valor) {
		if(cabeca == null) {
			cabeca = cauda = new NodeD(valor,cauda,cauda);
		}
		else {
			cauda = new NodeD(valor,cabeca,cauda);
			(cauda.anterior).proximo = cauda;
		}
	}
	
	public int removeInicio() {
		int returnV = -1;
		if(cabeca == null) {
			return returnV;
		}
		else if(cabeca == cauda){
			returnV = cabeca.valor;
			cabeca = cauda = null;
		}
		else {
			returnV = cabeca.valor;
			cabeca = cabeca.proximo;
			cabeca.anterior.proximo = cabeca.anterior.anterior = null;
			cabeca.anterior = cauda;
		}
		return returnV;
		
	}
	
	public int removeFim() {
		int returnV = -1;
		if(cabeca == null) {
			return returnV;
		}
		else if(cabeca == cauda){
			returnV = cauda.valor;
			cabeca = cauda = null;
		}
		else {
			returnV = cauda.valor;
			cauda = cauda.anterior;
			cauda.proximo.anterior = cauda.proximo.proximo = null;
			cauda.proximo = cabeca;
		}
		return returnV;
	}
	
	public void imprimeInicio() {
		NodeD corrente = cabeca;
		if(corrente == null) {
			System.out.println("Lista Vazia");
		}
		else while (corrente != null) {             
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
			System.out.print(corrente.valor + " , ");
			if(corrente == cabeca) {
				break;
			}
			corrente = corrente.anterior;
		}
		System.out.println("\n");
	}

}
