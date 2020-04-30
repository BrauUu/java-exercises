public class Pessoa {
	
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public Pessoa() {
		
	}
	
	public Pessoa(Endereco end) {
		this.endereco = end;
	}
	
	public Pessoa(String nome, String cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	public Pessoa(String nome, String cpf, Endereco end) {
		this.endereco = end;
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	public Pessoa(String nome, String cpf, String num, String rua, String bairro, String cep, String cidade, String estado) {
		this.endereco = new Endereco(num, rua, bairro, cep, cidade, estado);
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
	public String getCpf() {
		return this.cpf;
	}
	
	public String getEndereco() {
		return " Numero: " + endereco.getNumero() + "\n Rua: " + endereco.getRua() + "\n Bairro: " + endereco.getBairro()
		+ "\n Cep: " + endereco.getCep() + "\n Cidade: " + endereco.getCidade() + "\n Estado: " + endereco.getEstado();
	}
}
