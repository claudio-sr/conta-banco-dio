import java.util.Scanner;

public class Conta {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;


        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel");


    }
}
