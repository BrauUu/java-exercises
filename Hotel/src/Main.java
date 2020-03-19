public class Main {

	public static void main(String[] args) {
		
		Quarto quarto01 = new Quarto(120f,"Quarto com uma cama casal e banheiro.", 200);
				
		quarto01.locaQuarto("Pedro",5);
		quarto01.consumirItem(5.5f);
		quarto01.locaQuarto("Paulo",2);
		System.out.println(quarto01.getContaQuarto());

	}

}
