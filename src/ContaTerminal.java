import java.util.Scanner;

public class ContaTerminal {
    

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Por favor digite o número da conta! ");
       int numeroConta = scanner.nextInt();
       scanner.nextLine();

       System.out.println("Por favor informe sua agência: ");
       String agencia = scanner.nextLine();
        
       System.out.println("Por favor informe se nome: ");
       String nomeCliente = scanner.nextLine();

       System.out.println("Por favor informe seu saldo: ");
       double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo " + saldo +  " já está disponível para saque");
        scanner.close();
    }
}
