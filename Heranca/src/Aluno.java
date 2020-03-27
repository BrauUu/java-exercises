public class Aluno extends Pessoa{

	private String curso;
	private int matricula;
	
	public Aluno (String nome, int idade, String cpf, String curso, int matricula) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.curso = curso;
		this.matricula = matricula;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getDados() {
		return "Nome :" + this.nome +
				"\nIdade :" + this.idade +
				"\nCpf :" + this.cpf +
				"\nCurso :" + this.curso +
				"\nMatricula :" + this.matricula;
	}
	
}
