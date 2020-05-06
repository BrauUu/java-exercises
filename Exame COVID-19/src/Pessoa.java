public class Pessoa {

	private String nome;
	private String cpf;
	
	public Pessoa() {
		this.nome = "Desconhecido";
		this.cpf = "Desconhecido";
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String toString() {
		return this.nome + "\n" + this.cpf + "\n"; 
	}
}
