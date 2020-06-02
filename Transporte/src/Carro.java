
public class Carro extends Veiculo {
	
	
	public Carro(int anoDeFabricacao, String fabricante, int capacidade) {
		super(anoDeFabricacao,fabricante,capacidade);
	}
	
	public Carro(int anoDeFabricacao, String fabricante, int capacidade, String nome, int dataEmissaoCNH, String cpf) {
		super(anoDeFabricacao,fabricante,capacidade,nome,dataEmissaoCNH,cpf);
	}
	
	public float calculaVelocidadeMaxima(float distancia, float tempo) {
		return distancia/tempo;
	}
	
	public String imprime() {
		return super.imprime();
	}

}
