import java.util.Scanner;

public class DecisionTree {
	
	static final Scanner scan = new Scanner(System.in);
	
	public Node root;
	
	public DecisionTree() {
		this.root = null;
	}
	
	public void insertNode() {
		System.out.println("CONSTRUÇÃO DE ÁRVORE");
		if(root == null) {
			System.out.println("Qual frase deseja adicionar?");
			String content = scan.nextLine();
			this.root = new Node(content);
		}
		else {
			this.root.insertNode();
		}
		System.out.println("\n");
	}
	
	public void execDecision() {
		System.out.println("Executando Estrutura de Decisão:");
		root.execDecision();
	}
	
	public void preOrder() {
		this.preOrder(root);
	}
	
	public void preOrder(Node node) {
		if (node == null)
			return ;
		System.out.println(node.content);
		preOrder(node.leftNode);
		preOrder(node.rightNode);
	}

}
