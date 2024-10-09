import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) throws Exception {
     
    
     Scanner scanner = new Scanner(System.in);

    //solicita o numero da conta
    System.out.print("Por Favor, digite o numero da conta: ");
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); 


    //Solicita numero da Agencia
     System.out.print("Por Favor, digite o número da agência: ");
     String numeroAgencia = scanner.nextLine();
    

     //solicita nom etitular da conta
     System.out.print("Por Favor, digite o nome do titular da conta: ");
     String titular = scanner.nextLine();
    
    
    //solicita o Saldo
    System.out.print("Por Favor, digite o saldo da conta: ");
    double saldoConta;
    saldoConta =  scanner.nextDouble();
     
   

     //exibe os dados coletados
     System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
     + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$ " + saldoConta + " já está disponível para saque.");


     //Fecha Scanner
     scanner.close();
    }
}
