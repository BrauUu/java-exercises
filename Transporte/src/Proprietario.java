
public class Proprietario {
	
	public String nome;
	public int dataEmissaoCNH;
	public String cpf;
	
	public Proprietario() {
		
	}
	
	public Proprietario(String nome, int data, String cpf) {
		this.nome = nome;
		this.dataEmissaoCNH = data;
		this.cpf = cpf;
	}
	
	public String imprime() {
		return "Nome : " + this.nome + "\nData de Emissão da CNH: " + this.dataEmissaoCNH
				+ "\nCPF: " + this.cpf;
	}

}
