package laboratorio;

public class Computador {
    
    private static String nomeUnd;
    private String processador;
    private int hd;
    private int ram;
    private int ano;
    
   
    public Computador(String nomeUnd, String processador, int hd, int ram, int ano){
        this.nomeUnd = nomeUnd.toUpperCase();
        this.processador = processador;
        this.hd = hd;
        this.ram = ram;
        this.ano = ano;
    }
    
    public Computador(String nomeUnd, String processador, int hd, int ram) {
        this(nomeUnd,processador,hd,ram,2017);
    }
    
    public Computador() {
        this("Padrão","Pentium",40,2,2017);
    }
    
    public void setNomeUnd (String nomeUnd){
        Computador.nomeUnd = nomeUnd;
    }
        
    public void setProcessador (String processador){
        this.processador = processador;
    }
    
    public void setHD (int hd){
        this.hd = hd;
    }
    
    public void setRAM (int ram){
        if(ram > this.ram)
        {
            this.ram = ram;
        }
    }
    
    public void setAno (int ano){
        this.ano = ano;
    }
    
    public String getNomeUnd(){
        return nomeUnd.toUpperCase();
    }
    
    public String getProcessador(){
        return processador;
    }
    
    public int getHD(){
        return hd;
    }
    
    public int getRAM(){
        return ram;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void geraEtiqueta(){
        System.out.print("ETIQUETA\n Nome: " + getNomeUnd() + "\n Processador:" + getProcessador() + "\n Capacidade do HD:" + getHD() + "\n Memória RAM:" + getRAM() + "\n Ano de aquisição:" + getAno() + "\n");
    }
    
}
