import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Variáveis para armazenar os dados fornecidos pelo usuário
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        // Solicitando os dados ao usuário e armazenando nas variáveis
        System.out.println("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();  

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.next();  

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();  

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        // Exibindo a mensagem final com os dados fornecidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechando o scanner
        scanner.close();
    }
}
