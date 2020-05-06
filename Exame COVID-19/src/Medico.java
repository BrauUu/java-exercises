public class Medico extends Pessoa{
	
	private String crm;
	
	public Medico(String crm) {
		this.crm = crm;
	}
	
	public Medico(String crm, String nome, String cpf) {
		super(nome,cpf);
		this.crm = crm;
		
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public String getCrm() {
		return this.crm;
	}

	public String toString() {
		String resultado = super.toString();
		return resultado += this.crm + "\n";
	}
}
