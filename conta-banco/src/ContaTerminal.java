import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            int accountNumber;
            String accountAgency;
            String clientName;
            double accountBalance;

            System.out.print("Digite o número da conta: ");
            accountNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o número da agência: ");
            accountAgency = scanner.nextLine();

            System.out.print("Digite o seu nome: ");
            clientName = scanner.nextLine();

            System.out.print("Digite o seu saldo: ");
            accountBalance = scanner.nextDouble();

            System.out.println("Olá, " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + accountAgency + ", conta " + accountNumber + " e seu saldo de R$" + accountBalance
                    + " já está disponível para saque.");

        }
    }
}
