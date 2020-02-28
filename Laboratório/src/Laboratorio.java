
package laboratorio;

import java.util.Scanner;
        
public class Laboratorio {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Computador comp1;
        
        System.out.print("Nome da UND:");
        String nomeUnd = input.next();
        
        System.out.print("Processador:");
        String processador = input.next();
        
        System.out.print("Capacidade de HD:");
        int hd = input.nextInt();
        
        System.out.print("RAM:");
        int ram = input.nextInt();
        
        comp1 = new Computador(nomeUnd,processador,hd,ram);
        
        comp1.geraEtiqueta();
                
    }
    
}
