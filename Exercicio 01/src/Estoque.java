import java.util.Scanner;

/*2– Avaliar se a quantidade de produtos em estoque pode ser dividido por igual entre 2 filiais, 
 * considere que os produtos não podem ser fracionados.
 */

public class Estoque {

	private Scanner input = new Scanner(System.in);
	private int qtdEstoque;

	public void divisaoIgual() {

		System.out.print("Digite a quantidade de produtos em estoque:");
		qtdEstoque = input.nextInt();

		if (qtdEstoque % 2 == 0) {
			System.out.print("É possível dividir os produtos entre as duas filiais.\n");
		}

		else if (qtdEstoque % 2 != 0) {
			System.out.print("Não é possível dividir os produtos entre as duas filiais.\n");
		}
	}
}
