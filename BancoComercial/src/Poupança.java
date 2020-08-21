public class Poupança extends Conta implements PosJuros{

	private static int limiteSaques;
	private static float jurosMensal;
	
	public Poupança(){
		super();
		this.limiteSaques = 5;
		this.jurosMensal = 1;
	}
	
	public void setLimiteSaques(int limite) {
		this.limiteSaques = limite; 
	}
	
	public void setJurosMensal(float juros) {
		this.jurosMensal = juros;
	}
	
	public void calculaJuros() {
		this.saldo += this.saldo * this.jurosMensal / 100;
	}
}
 