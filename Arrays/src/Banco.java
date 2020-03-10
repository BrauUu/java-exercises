
public class Banco {
	
	private int numero;
	private String nome;
	private Conta[] contas2;
	private int contador;
	
	public Banco(int num, String nome) {
		numero = num;
		this.nome = nome;
		contas2 = new Conta[10];
		contador = 0;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionaConta(Conta c) {
		this.contas2[contador] = c;
		contador++;
	}
	
	public float getSaldo(int numConta) {
		return contas2[numConta].getSaldo();
	}
}
