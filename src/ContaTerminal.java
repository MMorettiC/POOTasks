import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args){
        
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite a sua agência:");
    String agencia = scanner.nextLine();

    System.out.println("Digite o seu número:");
    int numero = scanner.nextInt();
    scanner.nextLine();
    
    System.out.println("Digite o seu nome:");
    String nome = scanner.nextLine();

    System.out.println("Digite seu saldo:");
    float saldo = scanner.nextFloat();
    
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e o seu saldo " + saldo + " já esta disponível para saque.");
    
    scanner.close();

    }

}