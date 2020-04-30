public class Main {
	
	public static void main(String[] args) {
		
		Pedido ped1 = new Pedido("10/05","12:00","Parabens Mãe!", 0.5f, 0.25f, 0.8f, 180f, 16f, "Brayan", "154.996.806-90", 
				"367","Rua Diacuí", "Caíxaras","XXXXX-XXX","Patos de Minas", "MG","Gleibe", "154.996.806-00", 
				"25","Rua Vereador Olegário", "Sebastiana Alves","38780-000","Vazante", "MG");
		
		System.out.println(ped1.relatorio());
		
	}
}
