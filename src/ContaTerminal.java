import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        System.out.print("Insira o número da conta: ");
        int numero = Integer.parseInt(ent.nextLine());

        System.out.print("Insira a agência: ");
        String agencia = ent.nextLine();

        System.out.print("Insira o nome completo: ");
        String nome = ent.nextLine();

        System.out.print("Insira o saldo: ");
        double saldo = ent.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}