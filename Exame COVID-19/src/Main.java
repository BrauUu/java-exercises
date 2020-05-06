
public class Main {

	public static void main(String[] args) {
		
		Exame exame = new Exame(2, 11, 28, 05, true, false, "Pedro Silva", "158.487.957-02", "145895-05", "Rodrigo Peixoto", "478.547.021-24");
		System.out.println(exame.toString());
		System.out.println("\n" + exame.getRelatorio());
		
	}

}
