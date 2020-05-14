public class Main {

	public static void main(String[] args) {
		
		CartaoWeb[] cartoes = new CartaoWeb[3];
		
		cartoes[0] = new CartaoDiaDasMaes("Marta");
		cartoes[1] = new CartaoDiaDosNamorados("Jaqueline");
		cartoes[2] = new CartaoDeNatal("Rodrigo");
		
		for(int i=0;i < cartoes.length; i++) {
			System.out.println(cartoes[i].showMessage());
		}

	}

}
