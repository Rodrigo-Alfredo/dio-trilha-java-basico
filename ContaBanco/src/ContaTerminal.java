import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in); 
        
        String nome, numAgencia;
        int numConta;
        double saldo;
        
        System.out.println("Informe seu nome");
        nome = in.nextLine();
        System.out.println("Informe sua agência");
        numAgencia = in.nextLine();
        System.out.println("Informe o número da sua conta");
        numConta = in.nextInt();
        System.out.println("Informe seu saldo");  
        saldo = in.nextDouble();  
        
        System.out.printf("Olá " + nome + "! obrigado por abrir a conta, " + numConta + " agência " + numAgencia + " seu saldo é" + " %.2f", saldo);
        System.out.println(" e esta disponível para uso.");
        
        in.close();
    }
}
