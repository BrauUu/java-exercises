package campeonato;

public class Time {
    
    String nomeDoTime;
    String nomeDoTecnico;
    private int pontos;
    private int titulos;
    
    public Time(){
        
        titulos = 0;
        pontos = 0;
    }
    
    public void setNomeTime(String nome){
        nomeDoTime = nome;
    }
    
    public void setTitulos(int titulos){
        if(titulos > this.titulos)
            this.titulos = titulos;
    }
    
    public void setPontos(int pontos){
        if(pontos > this.pontos)
            this.pontos = pontos;
        if(pontos >= 30){
            titulos++;
        }
    }
    
    public void setNomeTec(String nome){
        this.nomeDoTecnico = nome;
    }
    
    public String getRelatorio() {
        return " Time: " + nomeDoTime + "\n Tecnico:" + nomeDoTecnico + "\n Pontuação: " + pontos + "\n Titulos: " + titulos;
    }   
}

//Resposta E: Não é possível que haja atributo de classe pois 
//cada objeto ou time terá seu nome pontos e assim por diante. 