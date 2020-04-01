import java.util.*;

public class TestaBanco {
	
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		
		int num, j;
		String nome;
		Banco banco;
		
		System.out.println("Qual o número do Banco?");
		num = input.nextInt();
		
		System.out.println("Qual o nome do Banco?");
		nome = input.next();
		
		System.out.println("Quantas contas serão criadas?");
		j = input.nextInt();
		
		banco = new Banco(num,nome,j);
		
		for(int i=0;i<j;i++) {
			Conta contaTemp = new Conta(1000 * (rand.nextFloat()), "Usuário", i);
			banco.adicionaConta(contaTemp);
			System.out.println("Saldo da Conta " + String.format("%.2f", banco.getSaldo(i)));
		}
	}

}
