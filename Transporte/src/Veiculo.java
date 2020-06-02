
public abstract class Veiculo {

	public int anoDeFabricacao;
	public String fabricante;
	public int capacidade;
	public Proprietario proprietario;
	
	public Veiculo() {
		
	}
	
	public Veiculo(int anoDeFabricacao, String fabricante, int capacidade) {
		this.anoDeFabricacao = anoDeFabricacao;
		this.fabricante = fabricante;
		this.capacidade = capacidade;
	}
	
	public Veiculo(int anoDeFabricacao, String fabricante, int capacidade, String nome, int dataEmissaoCNH, String cpf) {
		this.anoDeFabricacao = anoDeFabricacao;
		this.fabricante = fabricante;
		this.capacidade = capacidade;
		this.proprietario = new Proprietario(nome,dataEmissaoCNH,cpf);
	}
	
	public abstract float calculaVelocidadeMaxima(float x, float y);
	
	public String imprime() {
		return "Ano de Fabricação : " + this.anoDeFabricacao + "\nFabricante : " + this.fabricante
				+ "\nCapacidade : " + this.capacidade + "\nProprietário: " + this.proprietario;
	}
}
