import java.util.ArrayList;
import java.util.Calendar;

public abstract class Conta {
	
	protected static int count = 0;
	protected String id;
	protected String dataDeCriacao;
	protected float saldo;
	ArrayList<String> historico = new ArrayList();
	Calendar data = Calendar.getInstance();	
	
	public Conta() {	
		this.count++;
		this.id = Integer.toString(count);
		this.dataDeCriacao =  data.get(Calendar.DAY_OF_MONTH) + "/" + data.get(Calendar.MONTH) + "/" + data.get(Calendar.YEAR);
		this.saldo = 0;
	}
	
	public float saque(float valor) {
		this.saldo -= valor;
		this.adicionarMovimento(1, valor);
		return this.saldo;
	}
	
	public float deposito(float valor) {
		this.saldo += valor;
		this.adicionarMovimento(2, valor);
		return this.saldo;
	}
	
	public float transferencia(float valor, String id) {
		this.saldo -= valor;
		//Acessar outra conta e adicionar valor
		this.adicionarMovimento(3, valor);
		return this.saldo;
	}
	
	private void adicionarMovimento(int tipo, float valor) {
		if(tipo == 1) {
			this.historico.add("SAQUE : R$" + valor);
		}
		else if (tipo == 2) {
			this.historico.add("DEPOSITO : R$" + valor);
		}
		else if(tipo == 3) {
			this.historico.add("TRANSFERENCIA : R$" + valor);
		}
	}
	
	public float consultarSaldo() {
		return this.saldo;
	}
	
	public String visualizarHistorico() {
		String result = "      HISTORICO\n\n";
		int n = this.historico.size();
		
		for(int i=0;i<n;i++) {
			result += historico.get(i) + "\n";
		}
		
		return result;
	}
	
	public abstract void setLimiteSaques(int limite);

	public abstract void setJurosMensal(float juros);
}
