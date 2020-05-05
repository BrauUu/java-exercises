public class Paciente extends Pessoa{

	private boolean grupoDeRisco;
	private boolean viagem;
	
	public Paciente() {
		super();
		this.grupoDeRisco = false;
		this.viagem = false;
	}
	
	public Paciente(boolean risco, boolean viajou) {
		super();
		this.grupoDeRisco = risco;
		this.viagem = viajou;	
	}
	
	public Paciente(boolean risco, boolean viajou, String nome, String cpf) {
		super(nome,cpf);
		this.grupoDeRisco = risco;
		this.viagem = viajou;	
	}
	
	public void setGrupo(boolean grupo) {
		this.grupoDeRisco = grupo;
	}
	
	public boolean getGrupo() {
		return this.grupoDeRisco;
	}
	
	public void setViagem(boolean viagem) {
		this.viagem = viagem;
	}
	
	public boolean getViagem() {
		return this.viagem;
	}
}
