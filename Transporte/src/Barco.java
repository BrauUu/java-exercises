
public class Barco extends Veiculo {
	
	public Barco(int anoDeFabricacao, String fabricante, int capacidade) {
		super(anoDeFabricacao,fabricante,capacidade);
	}
	
	public Barco(int anoDeFabricacao, String fabricante, int capacidade, String nome, int dataEmissaoCNH, String cpf) {
		super(anoDeFabricacao,fabricante,capacidade,nome,dataEmissaoCNH,cpf);
	}
	
	public float calculaVelocidadeMaxima(float nos, float tempo) {
		return nos/tempo;
	}
	
	public String imprime() {
		return super.imprime();
	}

}