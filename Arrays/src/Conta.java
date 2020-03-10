public class Conta {
	
	private float saldo;
	
	public Conta(int saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(float deposito) {
		saldo += deposito;
	}
	
	public float getSaldo() {
		return saldo;
	}

}
