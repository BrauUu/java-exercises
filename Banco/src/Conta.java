package nãosei;

import java.util.Scanner;

public class Conta {
    
    private String  numero;
    private float   saldo;
    private String  nome;
    private Scanner input = new Scanner(System.in);
    public static float cpmf;
    
    public Conta(){ //Metódo construtor === automaticamente
        saldo = 200;
        numero = "0";
    } 
    
    public void setCpmf(float cpmf){
        this.cpmf = cpmf;
    }
    
    public float getCpmf(){
        return cpmf;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void saque(){
        
        System.out.print("Valor do saque:");
        float saque = input.nextFloat();
        if( saldo < saque ){
            System.out.print("Tu tá falido e só tem" + saldo);
        }
        else{
            this.saldo -= saque - cpmf;
        }
    }
    
    public void deposito(){
        System.out.print("Valor do depósito:");
        float deposito = input.nextFloat();
        this.saldo += deposito - cpmf;
    }
    
     public void setNumero(){
         System.out.print("Número da conta:");
         String numero = new String();
         numero = input.next();
         this.numero = numero;
    }
    
    public String getNumero(){
        return numero;
    }
 
    public String extrato(){
        return "\nMeu Banco\nConrrentista: " + numero + "\nSaldo: ''" + getSaldo() + "\nCPMF:" + getCpmf() ;
    }
}
