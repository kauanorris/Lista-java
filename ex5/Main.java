package ex5;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de gerenciamento de carros!");

        System.out.print("Digite a marca do carro: ");
        String marca = leitor.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = leitor.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = leitor.nextInt();

        leitor.nextLine(); 

        System.out.print("Digite a placa do carro: ");
        String placa = leitor.nextLine();

        Carro carro = new Carro(marca, modelo, ano, placa);

        boolean operacaoInvalida = false;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Exibir informações do carro");
            System.out.println("4. Sair");

            System.out.print("Opção: ");
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    carro.acelerar();
                    break;
                case 2:
                    carro.frear();
                    break;
                case 3:
                    carro.exibirInformacoes();
                    break;
                case 4:
                    System.out.println("Saindo do sistema de gerenciamento de carros. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    operacaoInvalida = true;
            }
        } while (!operacaoInvalida);

        leitor.close();
    }
}






