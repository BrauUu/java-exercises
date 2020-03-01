package Estoque;

public class Produto {
    
    private String nome;
    private int qtde = 0;
    private float precoV = 0;
    private float precoC = 0;
    private float passivo = 0;
    private float ativo = 0;
    
    public Produto(String nome){
        this.nome = nome;
    }
    
    public Produto(){
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQtde(int qtde){
        this.qtde = qtde;
    }
    
    private void setPrecoV(float precoC){
        this.precoV = precoC * 1.5f;
    }
    
    public void setPrecoC(float precoC){
        this.precoC = precoC;
        setPrecoV(precoC);
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getQtde(){
        return qtde;
    }
    
    public float getPrecoV(){
        return precoV;
    }
    
    public float getPrecoC(){
        return precoC;
    }
    
    public void compra(int qtde, float precoC){
        setQtde(this.qtde += qtde);
        if(precoC != this.precoC){
            setPrecoC(precoC);
            setPrecoV(precoC);
        }
        passivo += precoC * qtde;
    }
    
    public void venda (int qtde){
        if(qtde < this.qtde){
            setQtde(this.qtde -= qtde);
        }
        ativo += precoV * qtde;
    }
    
    public void mostrarResultado(){
        System.out.println("\tESTOQUE E PREÇOS\n NOME: " + getNome() + "\n QTDE: " + getQtde() + "\n PREÇO DE COMPRAR: R$" + getPrecoC() + "\n PREÇO DE VENDA: R$" + getPrecoV());
    }
    
    public void orcamento() {
    	System.out.println("\tORÇAMENTO\nATIVO: R$" + ativo + "\nPASSIVO: R$" + passivo + "\nSALDO: R$" + (ativo - passivo));
    }
    
}
