import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuário
        System.out.println("digite o número do cliente: ");
        int numero = scanner.nextInt();

        System.out.println("Insira a agência: ");
        String agencia = scanner.next();

        System.out.println("digite o nome do cliente: ");
        String nome = scanner.next();
        
        System.out.println("digite o sobrenome do cliente: ");
        String sobrenome = scanner.next();
        
        System.out.println("digite o saldo bancário: ");
        double saldo = scanner.nextDouble();

        scanner.close();
        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
