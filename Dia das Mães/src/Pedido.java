
public class Pedido {
	
	private String dataEntrega;
	private String horario;
	private String mensagem;
	private Produto produto;
	private Pessoa comprador;
	private Pessoa destinatario;
	
	public Pedido() {
		
	}
	
	public Pedido(Produto produto, Pessoa comprador, Pessoa destinatario) {
		this.produto = produto;
		this.comprador = comprador;
		this.destinatario = destinatario;
	}
	
	public Pedido(String data, String horario, String mensagem) {
		this.setData(data);
		this.setHorario(horario);
		this.setMensagem(mensagem);
	}
	
	public Pedido(String data, String horario, String mensagem, Produto produto, Pessoa comprador, Pessoa destinatario) {
		this.produto = produto;
		this.comprador = comprador;
		this.destinatario = destinatario;
		this.setData(data);
		this.setHorario(horario);
		this.setMensagem(mensagem);
	}
	
	public Pedido(String data, String horario, String mensagem, float altura, float largura, float profundidade, float preco, float peso, 
			String nomeC, String cpfC, Endereco endC, String nomeD, String cpfD, Endereco endD) {
		this.produto = new Produto(altura, largura, profundidade, preco, peso);
		this.comprador = new Pessoa(nomeC, cpfC, endC);
		this.destinatario = new Pessoa(nomeD, cpfD, endD);
		this.setData(data);
		this.setHorario(horario);
		this.setMensagem(mensagem);
	}
	
	public Pedido(String data, String horario, String mensagem, float altura, float largura, float profundidade, float preco, float peso,
			String nomeC, String cpfC, String numC, String ruaC, String bairroC, String cepC, String cidadeC, String estadoC,
			String nomeD, String cpfD, String numD, String ruaD, String bairroD, String cepD, String cidadeD, String estadoD) {
		this.produto = new Produto(altura, largura, profundidade, preco, peso);
		this.comprador = new Pessoa(nomeC, cpfC, numC, ruaC, bairroC, cepC, cidadeC, estadoC);
		this.destinatario = new Pessoa(nomeD, cpfD, numD, ruaD, bairroD, cepD, cidadeD, estadoD);
		this.setData(data);
		this.setHorario(horario);
		this.setMensagem(mensagem);
	}
	
	public void setData(String data) {
		this.dataEntrega = data;
	}
	
	public String getData() {
		return this.dataEntrega;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getHorario() {
		return this.horario;
	}
	
	public void setMensagem(String msg) {
		this.mensagem = msg;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}
	
	public String relatorio() {
		return "\t Comprador\n Nome: " + this.comprador.getNome() + "\n CPF: " + this.comprador.getCpf() + "\n" + this.comprador.getEndereco()
				+ "\n\n\t Destintário\n Nome: " + this.destinatario.getNome() + "\n CPF: " + this.destinatario.getCpf() + "\n" + this.destinatario.getEndereco()
				+ "\n\n\t Produto\n Cubagem: " + this.produto.getCubagem() + "\n Peso: " + this.produto.getPeso() + "\n PREÇO: " + this.produto.getPreco();
	}

}
