public class Endereco {

	public String rua;
	public String bairro;
	public String complemento;
	
	public Endereco(String rua, String bairro, String comp) {
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = comp;
	}
	
	public Endereco(String rua, String bairro) {
		this(rua,bairro," ");
	}
	
	public Endereco(String rua) {
		this(rua," "," ");
	}
}
