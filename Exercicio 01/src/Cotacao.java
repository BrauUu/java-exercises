import java.util.Scanner;

//1– Avaliar a cotação de preços de 3 empresas(matriz unidimensional).


public class Cotacao {
	
	private Scanner input = new Scanner(System.in);

	private float valores[] = new float[3];
	private float menorpreco;
	

	public void menorPreco() {

	int j = 1;
	
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o valor da cotação da empresa " + j++ + ":");
			valores[i] = input.nextFloat();

		}

		menorpreco = valores[0];
		System.out.print("Os valores são:");

		for (int i = 0; i < 3; i++) {

			System.out.print(valores[i] + "\n");

			if (valores[i] < menorpreco) {
				menorpreco = valores[i];
			}
		}
		System.out.print("A cotação de menor preço é:" + menorpreco);
	}
}
