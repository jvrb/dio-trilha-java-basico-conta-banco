import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira as informações abaixo!");

        System.out.print("Agência: ");
        String agencia = scanner.next();
        
        System.out.print("Numero: ");
        int numero = scanner.nextInt();
        
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Sobrenome do cliente: ");
        String sobrenomeCliente = scanner.next();

        System.out.print("Saldo: R$ ");
        double saldo = scanner.nextDouble();

        System.out.println("\n\n");

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponivel para saque.");

        System.out.println("\n\n");

    }
}
