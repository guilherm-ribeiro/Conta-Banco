import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeCliente;
        int conta;
        String agencia;
        double saldo = 1000;
        int opcao = 0;


        System.out.println("\n********************************************");
        System.out.println("   *** Bem vindo ao banco Grana Facil ***");
        System.out.println("\nSiga os proximos passos para abrir sua conta");
        System.out.println("\n********************************************");

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Abrir uma conta");
        System.out.println("2 - Sair");

        while (opcao != 2) {

            opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o seu nome completo: ");
                nomeCliente = leitura.nextLine();
                System.out.println("Digite o numero da conta: ");
                conta = leitura.nextInt();
                leitura.nextLine();
                System.out.println("Digite o numero da agencia: ");
                agencia = leitura.nextLine();
                System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + ",1 e seu saldo é: " + saldo + " já está disponível para saque.");

                break;


            } else if (opcao == 2) {
                System.out.println("Obrigado. Solicitação encerrada.");
                break;
            } else {
                System.out.println("Opção invalida. Tente novamente. ");
            }
        }
        leitura.close();
    }
}