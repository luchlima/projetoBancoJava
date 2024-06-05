import java.util.Scanner;

public class BancoLG {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double saldo;

        System.out.println("======== Crie sua conta! ========");
        System.out.println("Digite seu nome:");

        String nome = leitor.next();

        String menuTipoConta = """
                Escolha seu tipo de conta
                1- Corrente
                2- Poupança
                """;
        //========================================================================================
        System.out.println(menuTipoConta);
        int opcaoConta = leitor.nextInt();
        String contaEscolhida = "";
        switch (opcaoConta){
            case 1:
                contaEscolhida = "Corrente";
                System.out.println("Conta corrente escolhida");
                break;
            case 2:
                contaEscolhida = "Poupança";
                System.out.println("Conta poupança escolhida");
                break;
            case 3:
                System.out.println("Invalida");
                break;
        }
        //=======================================================================================
        System.out.println("Digite o valor desejado para depositar em sua conta:");
        saldo = leitor.nextDouble();
        System.out.println("Conta Criada com Sucesso!");
        //=======================================================================================

        System.out.println("=====================================");
        System.out.println("Dados Iniciais do Cliente:");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Conta: " + contaEscolhida);
        System.out.println("Saldo: " + " R$: " + saldo);
        System.out.println("=====================================");

        String menuOperacoes = """
                Operacões:
                
                1- Consultar Saldos
                2- Depositar Valor
                3- Transferir Valor
                4- Sair
                
                Digite a Opcão Desejada!
                """;

        int operacaoDesejada = 0;
        while (operacaoDesejada != 4){
            System.out.println(menuOperacoes);
            operacaoDesejada = leitor.nextInt();

            if (operacaoDesejada == 1){
                System.out.println("Saldo: R$ " + saldo);
            } else if (operacaoDesejada == 2) {
                System.out.println("Digite o valor que deseja depositar:");
                double valorDepositado = leitor.nextDouble();
                saldo += valorDepositado;
                System.out.println("Seu saldo atual é de: R$ " + saldo);
            } else if (operacaoDesejada == 3) {
                System.out.println("Digite o valor que deseja transferir :");
                double valorTransferido = leitor.nextDouble();
                System.out.println("Voce transferiu: R$ " + valorTransferido);
                if (valorTransferido > saldo){
                    System.out.println("Saldo Insuficiente");
                }else {
                    saldo -= valorTransferido;
                }
            } else{
                System.out.println("Operacao Encerrada");
            }
        }






    }
}
