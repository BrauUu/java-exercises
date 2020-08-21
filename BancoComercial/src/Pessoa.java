public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private String login;
	private String senha;
	private Conta conta;
	
	public Pessoa(String nome, String cpf, String login, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
	}
	
	public void alteraNome(String nomeNv) {
		this.nome = nomeNv;
	}
	
	public void alteraLogin(String loginNv) {
		this.login = loginNv;
	}
	
	public void alteraSenha(String senhaNv) {
		this.senha = senhaNv;
	}

}
