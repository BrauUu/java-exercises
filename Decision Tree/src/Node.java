import java.util.Scanner;

public class Node {
	
	static final Scanner scan = new Scanner(System.in);
	
	public Node   leftNode;
	public Node   rightNode;
	public String content;
	
	public Node(String content) {
		this.content = content;
		this.rightNode = this.leftNode = null;
	}
	
	public void insertNode() {
		
		if(!(this.content.contains("?"))) {
			System.out.println("Impossível Adicionar Frase - Este Fluxo Já Possue Uma Resposta");
			return;
		}
		
		System.out.println("\n" + this.content + " ('Sim' ou 'Não')");
		String option = scan.nextLine();
		
		if((option.toLowerCase().contains("n"))) {
			if(this.rightNode == null) {
				this.rightNode = new Node(this.addContent());
				System.out.println("Adicionado como resposta: " + this.rightNode.content);
			}
			else 
				this.rightNode.insertNode();
		}
		else if (option.toLowerCase().contains("s")) {
			if(this.leftNode == null) {
				this.leftNode = new Node(this.addContent());
					
				System.out.println("Adicionado como resposta: " + this.leftNode.content);
			}
			else 
				this.leftNode.insertNode();
		}
		else System.out.println("Resposta Inválida");		
	}	
	
	public String addContent() {
		System.out.println("Qual frase deseja adicionar?");
		String question = scan.nextLine();
		return question;
		
	}
	
	public void execDecision() {
		System.out.println("\n" + this.content + " ('Sim' ou 'Não')");
		String option = scan.nextLine();
		
		if((option.toLowerCase().contains("n"))){
			if(this.rightNode.rightNode == null && this.rightNode.leftNode == null) {
				System.out.println(this.rightNode.content);
			}
			else 
				this.rightNode.execDecision();
		}
		else if (option.toLowerCase().contains("s")) {
			if(this.leftNode.rightNode == null && this.leftNode.leftNode == null) {
				System.out.println(this.leftNode.content);
			}
			else
				this.leftNode.execDecision();
		}
	}
}
