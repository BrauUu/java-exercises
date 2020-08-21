public class Colaborador {
	
	private float salario;
	public String nome;
	public String cpf;
	public String dataDeAdmissao;
	public Endereco endereco;
	
	public Colaborador(){
		this.salario = 1045;
	}
	
	public void alteraSalario(float sal1, float sal2) {
		this.salario = sal1 + sal2;
	}

}
