public class Corrente extends Conta implements PosJuros{

	private static int limiteSaques;
	private static float jurosMensal;
	
	public Corrente(){
		super();
		this.limiteSaques = 3;
		this.jurosMensal = 2;
	}
	
	public void setLimiteSaques(int limite) {
		this.limiteSaques = limite; 
	}
	
	public void setJurosMensal(float juros) {
		this.jurosMensal = juros;
	}
	
	public void calculaJuros() {
		this.saldo -= this.saldo * this.jurosMensal / 100;
	}
}
