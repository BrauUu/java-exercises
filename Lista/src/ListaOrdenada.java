
public class ListaOrdenada extends Lista{
	
	public void insere(int item){
	       if(cabeca == null){
	           cabeca = cauda = new Node(item);
	       } 
	       else if(item <= cabeca.valor){
	           this.inserirInicio(item);
	       } 
	       else if(item >= cauda.valor){
	           this.inserirFim(item);
	       } 
	       else {
	           Node corrente = cabeca;
	           while(corrente.proximo.valor < item){
	               corrente = corrente.proximo;
	           }
	           corrente.proximo = new Node(item, corrente.proximo);
	       }
	   }
	
	public boolean isMember(int item) {
		Node corrente = cabeca;
		while(corrente.proximo != null) {
			if(corrente.valor == item) {
				return true;
			}
			corrente = corrente.proximo;
		}
		return false;
	}

}
