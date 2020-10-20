import java.util.Scanner;

public class Main {
	
	static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		DecisionTree dt = new DecisionTree();
		String option;
		
		do {
			dt.insertNode();
			System.out.println("Repetir bloco?");
			option = scan.nextLine();
		} while(option.toLowerCase().contains("s"));
		
		System.out.println("\n");
		
		do {
			dt.execDecision();
			System.out.println("Repetir bloco?");
			option = scan.nextLine();
		} while(option.toLowerCase().contains("s"));
		
	}
}
