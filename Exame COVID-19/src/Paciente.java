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
		if(this.grupoDeRisco == true) {
			
		}
	}
	
	public void setGrupo(String grupo) {
		grupo.toLowerCase();
		if(grupo.contains("sim")) {
			this.grupoDeRisco = true;
		}
		else if (grupo.contains("não")) {
			this.grupoDeRisco = false;
		}
	}
	
	public String getGrupoResposta() {
		if(this.grupoDeRisco == true) return this.getNome() + " pertence ao grupo de risco.";
		else if (this.grupoDeRisco == false) return this.getNome() + " não pertence ao grupo de risco.";
		else return "DADO NÃO COLETADO.";
	}
	
	public boolean getGrupo() {
		return this.grupoDeRisco;
	}
	
	public void setViagem(boolean viagem) {
		this.viagem = viagem;
	}
	
	public void setViagem(String viajou) {
		viajou.toLowerCase();
		if(viajou.contains("sim")) {
			this.viagem = true;
		}
		else if (viajou.contains("não")) {
			this.viagem = false;
		}
	}
	
	public String getViagemResposta() {
		if(this.viagem == true) return this.getNome() + " viajou nas últimas semanas.";
		else if (this.viagem == false) return this.getNome() + " não viajou nas últimas semanas.";
		else return "DADO NÃO COLETADO.";
	}
	
	public boolean getViagem() {
		return this.viagem;
	}
}
