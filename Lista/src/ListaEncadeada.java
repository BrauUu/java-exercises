
public class ListaEncadeada extends Lista{
	
	public ListaEncadeada() {
		super();
	}
	
	public void insereTerceiro(int valor) {
		if (cabeca == null) {
			System.out.println("Lista Vazia");
		}
		else if(cabeca.proximo == null) {
			System.out.println("Lista de Apenas um item");
		}
		else {
			Node terceiro = new Node(valor, cabeca.proximo.proximo);
			cabeca.proximo.proximo = terceiro;
		}			
	}
	
	public void insereDepois(int valorProcurado, int newValor) {
		Node anterior = this.pesquisaValor(valorProcurado);
		anterior.proximo = new Node(newValor, anterior.proximo);
		
	}
	
	public int removeFim() {
		Node corrente = cabeca;
		int retorno = 0;
		if(cabeca == null) {
			System.out.println("Lista Vazia");
			return retorno;
		}
		else if (cabeca == cauda) {
			cauda = null;
			cabeca = null;
			return cabeca.valor;
		}
		while(corrente.proximo != cauda) {
			corrente = corrente.proximo;
		}
		
		retorno = cauda.valor;
		corrente.proximo = null;
		cauda = corrente;
		return retorno;
	}
	
	public Node pesquisaValor(int valorProcurado) {
		Node corrente =  cabeca;
		while(corrente != null) {
			if(corrente.valor == valorProcurado) {
				return corrente;
			}
			else {
				corrente = corrente.proximo;
			}
		}
		return null;
	}
	
	public int encontraPosição (int valor) {
		Node corrente = cabeca;
		int pos = 1;
		while(corrente != null) {
			if(corrente.valor == valor)
				return pos;
		
			corrente = corrente.proximo;
			pos++;
		}
		return -1;
	}
	
}
