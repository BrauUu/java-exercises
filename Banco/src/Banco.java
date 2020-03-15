public class Banco {


    public static void main(String[] args) {
       
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta1.deposito();
        
        Conta.setCpmf(5);
        Conta.setCpmf(4);
                
        System.out.print(conta1.extrato());
        System.out.print(conta2.extrato());
        
    }
    
}
