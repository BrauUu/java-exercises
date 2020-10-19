public class TreeNode02 {
  TreeNode02 esquerdaNode;
  Funcionario func;
  TreeNode02 direitaNode;

  public TreeNode02(String nome, float sal){
    func = new Funcionario(nome,sal);
    esquerdaNode = direitaNode = null;
  }

  public void insereNode(String nome, float sal){
    if (func.nome.compareTo(nome) > 0){
      if (esquerdaNode == null)
       esquerdaNode = new TreeNode02(nome, sal);
      else
       esquerdaNode.insereNode(nome, sal);
    }
    else if (func.nome.compareTo(nome) < 0){
      if (direitaNode == null)
	direitaNode = new TreeNode02(nome, sal);
      else
	direitaNode.insereNode(nome, sal);
    }
  }
}
