
package campeonato;

public class Main {

    
    public static void main(String[] args) {
       
        Time time1 = new Time();
        
        time1.setNomeTime("Mengo");
        time1.setNomeTec("Roberto");
        
        time1.setTitulos(4);
        time1.setTitulos(2);
        
        time1.setPontos(5);
        
        System.out.println(time1.getRelatorio());
    }
    
}
