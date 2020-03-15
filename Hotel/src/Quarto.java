
public class Quarto {
	
			String status; 
		    String hospede;
		    String descricao;
	private int qtdDiarias;
	private int numQuarto;
	private float pagamento = 0;
	private float valorDiaria;
	
	public Quarto(float valorDiaria, String desc, int num) {
		this.setValorDiaria(valorDiaria);
		this.setDescricao(desc);
		this.setStatus("Liberado");
		this.setNumQuarto(num);
		
	}
	
	public void setStatus(String status) {	
		if(status == "Ocupado")
			this.status = status;
		else if (status == "Liberado")
			this.status = status;
		else
			System.out.println("STATUS INVALÍDO!");
	}
	
	public void setHospede(String nome) {
		this.hospede = nome;
	}
	
	public void setDescricao(String desc) {
		this.descricao = desc;
	}
	
	public void setQtdDiaria(int qtdD) {
		this.qtdDiarias = qtdD;
	}
	
	public void setValorDiaria(float valorD) {
		this.valorDiaria = valorD;
	}
	
	public void setNumQuarto(int num) {
		this.numQuarto = num;
	}
	
	public void setPagamento(float valor) {
		this.pagamento += valor;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public String getHospede() {
		return this.hospede;
	}
	
	public String getDescrição() {
		return this.descricao;
	}
	
	public int getQtdDiarias() {
		return this.qtdDiarias;
	}
	
	public int getNumQuarto() {
		return this.numQuarto;
	}
	
	public float getPagamento() {
		return this.pagamento;
	}
	
	public float getValorDiaria() {
		return this.valorDiaria;
	}
	
	public void locaQuarto(String nome, int qtdD) {
		if (this.status == "Liberado") {
			this.setHospede(nome);
			this.setQtdDiaria(qtdD);
			this.setStatus("Ocupado");
			this.setPagamento(this.qtdDiarias * this.valorDiaria);
		}
		else
			System.out.println("O Quarto " + this.numQuarto + " já está Locado.");
	}
	
	public void consumirItem(float preco) {
		  this.setPagamento(preco);
	}
	
	public void liberaQuarto() {
		this.setStatus("Liberado");
		this.setHospede("");
		this.setPagamento(0);
	}
	
	public String getContaQuarto() {
		return "----------------------------\n\tQuarto " + this.getNumQuarto() + "\nHospede: " + this.getHospede() + "\nVALOR A PAGAR: " + this.getPagamento();
	}

}
