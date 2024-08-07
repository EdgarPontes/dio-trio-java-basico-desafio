import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o número da conta: ");
        agencia = sc.next();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Por favor, Digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo de" + saldo +" já está disponível para saque!");
    }
}
