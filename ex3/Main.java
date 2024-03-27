package ex3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o numero da conta: ");
        int numeroConta = leitor.nextInt();
        leitor.nextLine(); 

        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = leitor.nextLine();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular);

        boolean operacaoInvalida = false;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Sair");

            System.out.print("Opção: ");
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = leitor.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = leitor.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + conta.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Saindo do sistema bancário. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    operacaoInvalida = true;
            }
        } while (!operacaoInvalida);
        
        leitor.close();
    }
}
    

    











