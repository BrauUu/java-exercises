package equipe;

public class Jogador {
    
    public static String nomeJ;
    public String nomeT;
    public float peso;
    private int falta;
    private int gols;
    
    public Jogador(float peso, String nome, String nomeT){
        this.peso = peso;
        this.nomeJ = nome;
        this.nomeT = nomeT;
        gols = 0;
        falta = 0;
        
    }
    
    public int getFalta(){
        return falta;
    }
    
    private void setFalta(int falta){
        this.falta = falta;
    }
    
    public int getGols(){
        return gols;
    }
    
    public void setGols(int gols){
        this.gols = gols;
    }
    
    public String getficha(){
        return "NOME: " + nomeJ + "FALTAS: " + falta + "\nGOLS: " + gols + "\nPESO: " + peso;
    }
    
    public void setPeso(float peso){
        if(peso > this.peso )
                setFalta(this.falta += falta);
        this.peso = peso;
    }
}
