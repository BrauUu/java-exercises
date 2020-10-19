public class Tree {
  private TreeNode raiz; //root

  public Tree(){
    raiz = null;  }

  public void insereNode(int insertValue){
    if (raiz == null)
      raiz = new TreeNode(insertValue);
    else
      raiz.insereNode(insertValue);
  }

  public void preordem(){
    preordem(raiz);   }

  private void preordem(TreeNode node){
    if (node == null)
      return ;

    System.out.print(node.info + " , ");
    preordem(node.esquerdaNode);
    preordem(node.direitaNode);
  }

  public void inordem(){
    inordem(raiz);   }

  private void inordem(TreeNode node){
    if (node == null)
      return ;
    inordem(node.esquerdaNode);
    System.out.print(node.info + " , ");
    inordem(node.direitaNode);
  }

  public void postordem(){
    postordem(raiz);   }

  private void postordem(TreeNode node){
    if (node == null)
      return ;
    postordem(node.esquerdaNode);
    postordem(node.direitaNode);
    System.out.print(node.info + " , ");
  }
    
  public void folhas(){
    folhas(raiz);   }

  private void folhas(TreeNode node){
    if (node == null)
      return ;

    if (node.esquerdaNode == null && node.direitaNode == null)
       System.out.print(node.info + " , ");
    folhas(node.esquerdaNode);
    folhas(node.direitaNode);
  }
  
  public void getGrau() {
	  getGrau(raiz);
  }
  
  public void getGrau(TreeNode node) {

	  if (node == null)
	      return ;

	  if (node.esquerdaNode != null && node.direitaNode != null)
	       System.out.println(node.info + " Apresenta Grau = 2");
	  else if (node.esquerdaNode == null && node.direitaNode == null)
	       System.out.println(node.info + " Apresenta Grau = 0");
	  else
	    System.out.println(node.info + " Apresenta Grau = 1");
	  getGrau(node.esquerdaNode);
	  getGrau(node.direitaNode);
  }
  
  public void getNivel() {
	  int nivel = 1;
	  getNivel(raiz, nivel);
  }
  
  public void getNivel(TreeNode node, int nivel) {
      if(node == null){
          return;
      }
      System.out.println(node.info+" - nivel" + nivel);
      getNivel(node.esquerdaNode, nivel + 1);
      getNivel(node.direitaNode, nivel + 1);
   }
}

