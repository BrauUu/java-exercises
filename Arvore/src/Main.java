
public class Main {

	public static void main(String[] args) {
		
		Tree02 t = new Tree02();
		t.insereNode("Carlos", 5000);
        t.insereNode("Beto", 4000);
        t.insereNode("Pedro", 4500);
        t.insereNode("Aldair", 4000);
        t.insereNode("Davi", 3000);
        t.insereNode("Zeca", 999);
        t.inordem();
        
        System.out.println("");
        t.getDiretoria();
        
        System.out.println("");
        t.getOperario();
        
        System.out.println("");
        t.getSalarioDiretoria();
        
        System.out.println("");
        t.getSalarioOperario();
        
        System.out.println("");
        t.buscaSalario("Pedro");
        
        System.out.println("");
        System.out.println(t.menosDe1000());
        
        System.out.println("");
        System.out.println(t.maisDe1000());
        
        //System.out.println("");
        //t.aumentoDiretoria();
        
        System.out.println("");
        //t.aumentoOperario();
        //System.out.println("");
        //t.inordem();   
        System.out.println(t.salarioOprMais1500());        
	}

}
