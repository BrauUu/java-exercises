public interface Trabalhista {
	
	int INSS = 7;
	
	float calculaSalarioLiquido(int dias);
	
	float calculaINSS(int dias);
	
	float calculaFerias(int dias);
	
	float calcula13Salario(int parcela, int meses);

}
