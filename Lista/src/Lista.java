public class Lista {
	
	public Node cauda;
	public Node cabeca;
	
	public Lista() {
		this.cauda = null;
		this.cabeca = null;
	}
	
	public void inserirInicio(int item) {         
		if (cabeca == null) {             
			cabeca = cauda = new Node(item);         
		} 
		else {             
			cabeca = new Node(item, cabeca);         
		}     
	}
	
	public void inserirFim(int item) {         
		if (cabeca == null) {             
			cabeca = cauda = new Node(item);         
		} else {             
			cauda = cauda.proximo = new Node(item);        
		}     
	}
	
	public void imprimirLista() {         
		Node corrente = cabeca;
		if(corrente == null) {
			System.out.println("Lista Vazia");
		}
		else while (corrente != null) {             
			System.out.print(corrente.valor + " , ");            
			corrente = corrente.proximo;         
		}
		System.out.print("\n");
	}

}
