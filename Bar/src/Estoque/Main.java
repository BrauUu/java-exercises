
package Estoque;

public class Main {
    public static void main(String[] args) {
        
        Produto guarana = new Produto();
        
        guarana.setNome("Mineiro");
        guarana.compra(10, 5.0f);
        guarana.venda(5);
        guarana.mostrarResultado();
        guarana.orcamento();
        
    }
    
}
