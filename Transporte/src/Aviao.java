
public class Aviao extends Veiculo {
	
	public Aviao(int anoDeFabricacao, String fabricante, int capacidade) {
		super(anoDeFabricacao,fabricante,capacidade);
	}
	
	public Aviao(int anoDeFabricacao, String fabricante, int capacidade, String nome, int dataEmissaoCNH, String cpf) {
		super(anoDeFabricacao,fabricante,capacidade,nome,dataEmissaoCNH,cpf);
	}
	
	public float calculaVelocidadeMaxima(float pes, float tempo) {
		return pes/tempo;
	}
	
	public String imprime() {
		return super.imprime();
	}

}