
public class Main {

	public static void main(String[] args) {
		
		/*	ListaEncadeada l = new ListaEncadeada();
		
		l.inserirInicio(5);
		l.inserirInicio(2);
		l.inserirInicio(7);
		l.imprimirLista();
		System.out.println(l.encontraPosição(7));*/
		
		/*ListaOrdenada lo = new ListaOrdenada();
		
		lo.insere(4);
		lo.insere(2);
		lo.insere(7);
		lo.insere(11);
		lo.insere(2);
		lo.imprimirLista();
		System.out.println(lo.isMember(7));*/
		
		ListaDuplamenteEncadeada lde = new ListaDuplamenteEncadeada();
		
		lde.insereOrdenado(3);
		lde.insereOrdenado(4);
		lde.insereOrdenado(2);
		lde.insereOrdenado(7);
		lde.insereOrdenado(1);
		lde.insereOrdenado(7);
		lde.insereOrdenado(-3);
		lde.insereOrdenado(5);
		
		lde.imprimeInicio();
		lde.imprimeFim();
		
		
		/*lde.insereInicio(5);
		lde.insereInicio(10);
		lde.insereInicio(8);
		lde.insereSegundo(4);
		lde.insereFim(12);
		lde.insereTerceiro(7);
		
		lde.imprimeInicio();
		lde.imprimeFim();
		
		System.out.println(lde.removePenultimo());
		
		lde.imprimeInicio();
		lde.imprimeFim();*/
		
		/*ListaCircular lc = new ListaCircular();
		
		lc.insereFim(4);
		lc.insereFim(6);
		lc.insereInicio(5);
		lc.imprimeInicio();
		lc.imprimeFim();
		
		System.out.println(lc.removeInicio());
		
		lc.imprimeInicio();
		lc.imprimeFim();
		
		System.out.println(lc.removeFim());
		
		lc.imprimeInicio();
		lc.imprimeFim();*/

	}

}
