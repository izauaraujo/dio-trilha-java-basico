import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("POR FAVOR INFORME OS DADOS ABAIXO E APERTE ENTER: ");

        System.out.print("Nome: ");
        String nomeCliente = sc.next();
        sc.nextLine();

        System.out.print("Numero da Conta: ");
        int numero = sc.nextInt();

        System.out.print("Número da Agência: ");
        String agencia = sc.next();

        System.out.print("Saldo atual: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco"
                + " sua agência é %s, conta %d e seu saldo %.2f já está disponível"
                + " para saque", nomeCliente, agencia, numero, saldo);
    }
}
