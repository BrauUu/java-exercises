public class Cliente extends Pessoa{
	
	private float renda;
	
	public Cliente(String nome, String cpf, String login, String senha) {
		super(nome,cpf,login,senha);
		this.renda = 1031;
	}
	
	public Cliente(String nome, String cpf, String login, String senha,float renda) {
		super(nome,cpf,login,senha);
		this.renda = renda;
	}

}
