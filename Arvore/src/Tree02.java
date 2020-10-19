
public class Tree02 {
	
	private TreeNode02 raiz; //root

	  public Tree02(){
	    raiz = null;  }

	  public void insereNode(String nome, float sal){
	    if (raiz == null)
	      raiz = new TreeNode02(nome, sal);
	    else
	      raiz.insereNode(nome, sal);
	  }
	  
	  public void inordem(){
		inordem(raiz);   }

	  private void inordem(TreeNode02 node){
		if (node == null)
			return ;
		inordem(node.esquerdaNode);
		System.out.print(node.func.nome + " : " + node.func.salario + ", ");
		inordem(node.direitaNode);
	  }

		  
	   public void getDiretoria() {
		   getDiretoria(raiz);
	   }
		  
	   public void getDiretoria(TreeNode02 node) {
		      if(node == null){
		          return;
		      }
		      if(node.direitaNode != null || node.esquerdaNode != null) {
		    	  System.out.print(node.func.nome + ", ");
		      }
		      getDiretoria(node.esquerdaNode);
		      getDiretoria(node.direitaNode);
	   }
	   
	   public void getOperario() {
		   getOperario(raiz);
	   }
	   
	   public void getOperario(TreeNode02 node) {
		   if (node == null) {
			   return;
		   }
		   else if (node.direitaNode == null && node.esquerdaNode == null) {
			   System.out.print(node.func.nome + ", ");
		   }
		   getOperario(node.esquerdaNode);
		   getOperario(node.direitaNode);
	   }
	   
	   public void getSalarioDiretoria() {
		   System.out.println(getSalarioDiretoria(raiz));
	   }
		  
	   public float getSalarioDiretoria(TreeNode02 node) {
		      if(node == null){
		          return 0;
		      }
		      if(node.esquerdaNode != null || node.direitaNode != null) {
		    	  float salario = node.func.salario;
		    	  return salario + getSalarioDiretoria(node.esquerdaNode) + getSalarioDiretoria(node.direitaNode);
		    	  
		      }
		      else {
		    	  return getSalarioDiretoria(node.esquerdaNode) + getSalarioDiretoria(node.direitaNode);
		      }
	   }
	   
	   public void getSalarioOperario() {
		   System.out.println(getSalarioOperario(raiz));
	   }
		  
	   public float getSalarioOperario(TreeNode02 node) {
		      if(node == null){
		          return 0;
		      }
		      if(node.esquerdaNode == null && node.direitaNode == null) {
		    	  float salario = node.func.salario;
		    	  return salario + getSalarioOperario(node.esquerdaNode) + getSalarioOperario(node.direitaNode);
		    	  
		      }
		      else {
		    	  return getSalarioOperario(node.esquerdaNode) + getSalarioOperario(node.direitaNode);
		      }
	   }
	   
	   public void buscaSalario(String nome) {
		   buscaSalario(nome, raiz);
	   }
	   
	   public void buscaSalario(String nome, TreeNode02 node) {
			if(node == null) {
				return;
			}
			else if(node.func.nome == nome) {
				System.out.println(node.func.salario);
			}
			else {
				buscaSalario(nome, node.esquerdaNode);
				buscaSalario(nome, node.direitaNode);
				return;
			}
	   }
	   
	   public void getNivel() {
			  int nivel = 1;
			  getNivel(raiz, nivel);
		  }
		  
		  public void getNivel(TreeNode02 node, int nivel) {
		      if(node == null){
		          return;
		      }
		      System.out.println(node.func.nome+" - nivel" + nivel);
		      getNivel(node.esquerdaNode, nivel + 1);
		      getNivel(node.direitaNode, nivel + 1);
		   }
	   
	   public int menosDe1000() {
		   
		   return menosDe1000(raiz);
	   }
	   
	   public int menosDe1000(TreeNode02 node) {
		  if (node == null) {
			  return 0;
		  }
		  if (node.func.salario < 1000) {
			  return (1 + menosDe1000(node.esquerdaNode) + menosDe1000(node.direitaNode));
		  }
		  else {
			  return menosDe1000(node.esquerdaNode) + menosDe1000(node.direitaNode);
		  }
	   }
	   
	   	public int maisDe1000() {
		   
		   return maisDe1000(raiz);
	   }
	   
	   public int maisDe1000(TreeNode02 node) {
		  if (node == null) {
			  return 0;
		  }
		  if (node.func.salario > 1000) {
			  return (1 + maisDe1000(node.esquerdaNode) + maisDe1000(node.direitaNode));
		  }
		  else {
			  return maisDe1000(node.esquerdaNode) + maisDe1000(node.direitaNode);
		  }
	   }
	   
	   public int salarioOprMais1500(){
	        return salarioOprMais1500(this.raiz);
	    }
	    public int salarioOprMais1500(TreeNode02 node){
	        if(node == null){
	            return 0;
	        } else {
	            if(node.func.salario > 1500 && node.esquerdaNode == null && node.direitaNode == null){ 
	                return 1;
	            } else{
	                return salarioOprMais1500(node.esquerdaNode) + salarioOprMais1500(node.direitaNode);
	            }  
	        }     
	    }
	   
	   public void aumentoDiretoria() {
		   aumentoDiretoria(raiz);
	   }
	   
	   public void aumentoDiretoria(TreeNode02 node) {
		   if(node == null)
			   	return;
		   else
			   if(node.direitaNode != null || node.esquerdaNode != null) {
				   node.func.salario += 100;
				   aumentoDiretoria(node.direitaNode);
				   aumentoDiretoria(node.esquerdaNode);
			   }
			   else
				   return;
	   }
	   
	   public void aumentoOperario() {
		   aumentoOperario(raiz);
	   }
	   
	   public void aumentoOperario(TreeNode02 node) {
		   if(node == null)
			   	return;
		   else
			   if(node.direitaNode == null && node.esquerdaNode == null) {
				   node.func.salario += 10;
			   }
			   else
				   aumentoOperario(node.direitaNode);
		   		   aumentoOperario(node.esquerdaNode);
	   }		 
}
