package ex4;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de gerenciamento de jogadores!");

        System.out.print("Digite o nome do jogador: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a pontuação inicial do jogador: ");
        int pontuacao = leitor.nextInt();

        System.out.print("Digite o nível inicial do jogador: ");
        int nivel = leitor.nextInt();

        Jogador jogador = new Jogador(nome, pontuacao, nivel);

        boolean operacaoInvalida = false;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Aumentar pontuação");
            System.out.println("2. Subir de nível");
            System.out.println("3. Exibir informações do jogador");
            System.out.println("4. Sair");

            System.out.print("Opção: ");
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de pontos a serem adicionados: ");
                    int pontos = leitor.nextInt();
                    jogador.aumentarPontuacao(pontos);
                    break;
                case 2:
                    jogador.subirNivel();
                    break;
                case 3:
                    jogador.exibirInformacoes();
                    break;
                case 4:
                    System.out.println("Saindo do sistema de gerenciamento de jogadores. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    operacaoInvalida = true;
            }
        } while (!operacaoInvalida);

        leitor.close();
    }
}


