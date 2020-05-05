public class Exame {
	
	private Data dataExame;
	private Data dataEntrega;
	private Paciente paciente;
	private Medico medico;
	
	public Exame(Data dataEx, Data dataEnt, Paciente pac, Medico med) {
		this.dataExame = dataEx;
		if(pac.getGrupo() || pac.getViagem()) this.dataEntrega = dataEx;
		else this.dataEntrega = dataEnt;
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
		String grupo;
		String viagem;
		String diaEx;
		String mesEx;
		String diaEnt;
		String mesEnt;
		
		if(this.paciente.getGrupo())
			grupo = "Pertence";
		else
			grupo = "Não pertence";
		
		if(this.paciente.getViagem())
			viagem = "Viajou";
		else
			viagem = "Não viajou";
		
		if(this.dataExame.getDia() < 10) diaEx = "0" + this.dataExame.getDia();
		else diaEx = Integer.toString(this.dataExame.getDia());
		
		if(this.dataExame.getMes() < 10) mesEx = "0" + this.dataExame.getMes();
		else mesEx = Integer.toString(this.dataExame.getMes());
		
		if(this.dataEntrega.getDia() < 10) diaEnt = "0" + this.dataEntrega.getDia();
		else diaEnt = Integer.toString(this.dataEntrega.getDia());
		
		if(this.dataEntrega.getMes() < 10) mesEnt = "0" + this.dataEntrega.getMes();
		else mesEnt = Integer.toString(this.dataEntrega.getMes());
		
		String resultado =  "             EXAME - COVID-19\n\n \t\t Paciente\n\t Nome: " + this.paciente.getNome() 
		+ "\n\t CPF: " + this.paciente.getCpf() 
		+ "\n\t Pertence ao grupo de risco: " + grupo
		+ "\n\t Viajou recentemente: " + viagem 
		+ "\n\n \t\t Medico\n\t Nome: " + this.medico.getNome() + "\n\t CPF: " 
		+ this.medico.getCpf() + "\n\t CRM: " + this.medico.getCrm() 
		+ "\n\n\t Data do Exame: " + diaEx + "/" 
		+ mesEx +  "\n\t Data de Entrega do Exame:" 
		+ diaEnt + "/" + mesEnt;
		return resultado;
	}
	
	public void setMedico(String nome, String cpf, String crm) {
		this.medico.setNome(nome);
		this.medico.setCpf(cpf);
		this.medico.setCrm(crm);
	}
	
	public void setPaciente(String nome, String cpf, boolean grupo, boolean viagem) {
		this.paciente.setNome(nome);
		this.paciente.setCpf(cpf);
		this.paciente.setGrupo(grupo);
		this.paciente.setViagem(viagem);
		if(this.paciente.getGrupo() || this.paciente.getViagem())
			this.dataEntrega.setData(this.dataExame.getDia(), this.dataExame.getMes());
	}
	
	public void setDataExame(int dia, int mes) {
		this.dataExame.setData(dia, mes);
	}
	
	public void setDataEntrega(int dia, int mes) {
		this.dataEntrega.setData(dia, mes);
	}

}
