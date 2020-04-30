public class Endereco {
	
	private String numero;
	private String rua;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	public Endereco() {
		
	}
	
	public Endereco(String num, String rua, String bairro, String cep, String cidade, String estado) {
			this.setNumero(num);
			this.setRua(rua);
			this.setBairro(bairro);
			this.setCep(cep);
			this.setCidade(cidade);
			this.setEstado(estado);
	}
	
	public void setNumero (String num) {
		this.numero = num;
	}
	
	public void setRua (String rua) {
		this.rua = rua;
	}
	
	public void setBairro (String bairro) {
		this.bairro = bairro;
	}
	
	public void setCep (String cep) {
		this.cep = cep;
	}
	
	public void setCidade (String cidade) {
		this.cidade = cidade;
	}
	
	public void setEstado (String estado) {
		this.estado = estado;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public String getEstado() {
		return this.estado;
	}

}
