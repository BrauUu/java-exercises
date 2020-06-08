public class Funcionario extends Pessoa implements Trabalhista, Recibo{

	public String setor;
	public float salarioDia;
	
	public Funcionario(String nome, int idade, String setor, float salD) {
		super(nome,idade);
		this.setor = setor;
		this.salarioDia = salD;
	}
	
	public float calculaSalarioLiquido(int dias) {
		return salarioDia * dias;
	}
	
	public float calculaINSS(int dias) {
		return this.calculaSalarioLiquido(dias) * INSS/100;
	}
	
	public float calculaFerias(int dias) {
		return this.calculaSalarioLiquido(dias) * 0.3f;
	}
	
	public float calcula13Salario(int parcela, int meses) {
		return (this.calculaSalarioLiquido(20) / 12) * meses;
	}
	
	public String reciboFerias(int dias) {
		return "Recibo de Ferias \n" + this.calculaFerias(dias);
	}
	
	public String contraCheque(int dias) {
		return "Contra Cheque \n" + this.calculaSalarioLiquido(dias);
	}
	
	public String recibo13Salario(int parcela, int meses) {
		return "Recido 13º Salario \n" + this.calcula13Salario(parcela,meses);
	}
	
}
