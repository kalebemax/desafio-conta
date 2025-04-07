import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Kalebe Max";
        String conta = "Corrente";
        double saldo = 2000.00;
        int operacao = 0;

        System.out.println("\n**************************");
        System.out.println("\nNome: " + nome);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n**************************");

        String menu = """

                Digite a operaçao desejada:

                    1 - Consultar saldo
                    2 - Sacar
                    3 - Transferir
                    4 - Depositar
                    5 - Sair

                    """;

        Scanner leitura = new Scanner(System.in);

        while (operacao != 5) {
            System.out.println(menu);
            operacao = leitura.nextInt();

            if (operacao == 1) {
                System.out.println("\nSeu saldo é: " + saldo);
            } else if (operacao == 2) {
                System.out.println("\nDigite o valor que deseja sacar: ");
                double valorSaque = leitura.nextDouble();
                if (valorSaque > saldo) {
                    System.out.println("\nSaldo insuficiente");
                } else {
                    saldo -= valorSaque;
                    System.out.println("\nSaque realizado com sucesso");
                }
            } else if (operacao == 3) {
                System.out.println("\nDigite o valor que deseja transferir: ");
                double valorTransferencia = leitura.nextDouble();
                System.out.println("\nDigite o nome do destinatário: ");
                String nomeDestinatario = leitura.next();
                if (valorTransferencia > saldo) {
                    System.out.println("\nSaldo insuficiente");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("\nTransferência realizada com sucesso para " + nomeDestinatario + "!");
                }
            } else if (operacao == 4) {
                System.out.println("\nDigite o valor que deseja depositar: ");
                double valorDeposito = leitura.nextDouble();
                saldo += valorDeposito;
                System.out.println("\nDepósito realizado com sucesso");
            } else if (operacao == 5) {
                System.out.println("Obrigado por usar nosso sistema!");
            } else {
                System.out.println("\nOperaçao inválida");
            }

        }
    }
}
