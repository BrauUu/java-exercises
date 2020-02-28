package Estoque;

public class Produto {
    
    private String nome;
    private int qtde;
    private float precoV;
    private float precoC;
    
    public Produto(String nome){
        qtde = 0;
        this.nome = nome;
    }
    
    public Produto() {
        this("");
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQtde(int qtde){
        this.qtde = qtde;
    }
    
    private void setPrecoV(float precoV){
        this.precoV = precoV;
    }
    
    private void setPrecoC(float precoC){
        this.precoC = precoC;
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
            setPrecoV(precoC * 1.5f);
        }
    }
    
    public void venda (int qtde){
        if(qtde < this.qtde){
            setQtde(this.qtde -= qtde);
        }
    }
    
    public void mostrarResultado(){
        System.out.println("ESTOQUE E PREÇOS\n NOME: " + getNome() + "\n QTDE: " + getQtde() + "\n PREÇO DE COMPRAR: R$" + getPrecoC() + "\n PREÇO DE COMPRA: R$" + getPrecoV());
    }
    
}
