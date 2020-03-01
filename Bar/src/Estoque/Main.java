
package Estoque;

import java.util.Scanner;


public class Main {
	
    private static Scanner input;

	public static void main(String[] args) {
        
        Produto prod1;
        int qtd;
        float precoC;
        String nome;
        input = new Scanner(System.in);
        
        System.out.println("Qual o nome do produto:");
        nome = input.next();
        
        System.out.println("Qual a quantidade de produtos:");
        qtd = input.nextInt();
        
        System.out.println("Qual o valor do produto:R$");
        precoC = input.nextFloat();
                     
        prod1 = new Produto(nome);
        
        prod1.compra(qtd, precoC);
        prod1.venda(5);
        prod1.mostrarResultado();
        prod1.orcamento();
        
    }
    
}
