
public class Main {

	public static void main(String[] args) {
		
		/*	ListaEncadeada l = new ListaEncadeada();
		
		l.inserirInicio(5);
		l.inserirInicio(2);
		l.inserirInicio(7);
		l.imprimirLista();
		System.out.println(l.encontraPosição(7));*/
		
		ListaOrdenada lo = new ListaOrdenada();
		
		lo.insere(4);
		lo.insere(2);
		lo.insere(7);
		lo.insere(11);
		lo.insere(2);
		lo.imprimirLista();
		System.out.println(lo.isMember(7));

	}

}
