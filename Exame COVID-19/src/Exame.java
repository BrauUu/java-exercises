public class Exame {
	
	private Data dataExame;
	private Data dataEntrega;
	private Paciente paciente;
	private Medico medico;
	
	public Exame(Data dataEx, Data dataEnt, Paciente pac, Medico med) {
		this.dataExame = dataEx;
		if(pac.getGrupo() || pac.getViagem()) {
			this.dataEntrega = dataEx;
		}
		else {
			this.dataEntrega = dataEnt;
		}
		this.paciente = pac;
		this.medico = med;
	}
	
	public Exame(int diaEx, int mesEx, int diaEnt, int mesEnt, boolean risco, boolean viajou, 
			String nomeP, String cpfP, String crm, String nomeM, String cpfM) {
		this.dataExame = new Data(diaEx,mesEx);
		
		if(risco || viajou) 
			this.dataEntrega = new Data(diaEx, mesEx);
		else
			this.dataEntrega = new Data(diaEnt, mesEnt);
		this.paciente = new Paciente(risco, viajou, nomeP, cpfP);
		this.medico = new Medico(crm, nomeM, cpfM);
	}
	
	public String getRelatorio() {
		return "             EXAME - COVID-19\n\n \t\t Paciente\n\t Nome: " + this.paciente.getNome() + "\n\t CPF: " + this.paciente.getCpf() 
		+ "\n\t Pertence ao grupo de risco: " + this.paciente.getGrupoResposta() + "\n\t Viajou recentemente: " 
		+ this.paciente.getViagemResposta() + "\n\n \t\t Medico\n\t Nome: " + this.medico.getNome() + "\n\t CPF: " + this.medico.getCpf() + "\n\t CRM: " 
		+ this.medico.getCrm() + "\n\n\t Data do Exame: " + this.dataExame.getData() + "\n\t Data de Entrega do Exame:" 
		+ this.dataEntrega.getData();
	}

}
