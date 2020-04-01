public class Conta {
	
	private float saldo;
	private String nome;
	private int id;
	
	public Conta(float saldo, String nome, int id) {
		this.saldo = saldo;
		this.nome = nome;
		this.id = id;
	}
	
	public void deposito(float deposito) {
		saldo += deposito;
	}
	
	public float getSaldo() {
		return saldo;
	}

}
