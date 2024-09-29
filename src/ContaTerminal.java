import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia;
        String nome;
        Double saldo = 237.48;// Porque o cliente digitar seu proprio saldo fica estranho

        System.out.println("Digite seu Nome: ");
        nome = scanner.nextLine();

        System.out.println("Agencia: ");
        agencia = scanner.nextLine();

        System.err.println("Numero: ");
        numero = scanner.nextInt();

        System.out.println("Olá "
                + nome + " obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta "
                + numero + " e seu saldo "
                + saldo + " já está disponível para saque.");

    }
}
