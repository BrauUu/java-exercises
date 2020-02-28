import javax.swing.JOptionPane;

/*4- Armazenar a quantidade vendida de 10 produtos de uma loja e realizar as seguintes avaliações:
	- quantidade total de unidades vendidas;
	- nome dos produtos vendidos acima da média de venda;*/

public class Venda {
	
	private int quantidade[] = new int[10];
	private String produtos[] = new String[10];

	
	public void produtosVendidos() {
		
		int total = 0;
		
		for(int i=0;i<10;i++) {
			produtos[i] = JOptionPane.showInputDialog("Qual o produto?");
			quantidade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida de " + produtos[i] + ":"));
			
			total += quantidade[i];
		}
		
		JOptionPane.showMessageDialog(null,"A quantidade total de produtos vendidos é: " + total + "\n");
		produtosAcimaDaMedia();
		
	}
	
	public void produtosAcimaDaMedia() {
		
		int mediaDeVenda;
		String produtosAcimaDaMedia = new String();
		
		mediaDeVenda = Integer.parseInt(JOptionPane.showInputDialog("Qual a média e venda?"));
		
		JOptionPane.showMessageDialog(null ,"Os produtos vendidos acima da média são:\n");
		
		for(int i=0;i<10;i++) {
			
			if(quantidade[i] >= mediaDeVenda) {
				
				produtosAcimaDaMedia += produtos[i] + "\n";
			}
		}
		
		JOptionPane.showMessageDialog(null,produtosAcimaDaMedia);
	}
	
}
