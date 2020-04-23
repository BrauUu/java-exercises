
public class Atleta extends Pessoa {
	
	public String categoria;
	private int idade;
	
	public void setIdade(int idade) {
		if(idade > this.idade) this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}

}
