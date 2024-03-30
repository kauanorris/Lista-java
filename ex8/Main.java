package ex8;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static List<Pizza> pizzasDisponiveis = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();
        
        System.out.println("Bem-vindo à Pizzaria!");
        
        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Adicionar pizza");
            System.out.println("2. Remover pizza");
            System.out.println("3. Exibir detalhes do pedido");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    adicionarPizza(scanner, pedido);
                    break;
                case 2:
                    removerPizza(scanner, pedido);
                    break;
                case 3:
                    pedido.exibirDetalhes();
                    break;
                case 4:
                    System.out.println("Obrigado por escolher a Pizzaria! Volte sempre!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    public static void adicionarPizza(Scanner scanner, Pedido pedido) {
        
        Pizza pizza = new Pizza("Mussarela", 30.0, List.of("Molho de tomate", "Mussarela"));
        pedido.adicionarPizza(pizza);
        
        System.out.println("Pizza adicionada com sucesso!");
    }

    public static void removerPizza(Scanner scanner, Pedido pedido) {
        System.out.println("Digite o índice da pizza que deseja remover:");
        int indice = scanner.nextInt();
        scanner.nextLine(); 
        pedido.removerPizza(indice - 1); 
        System.out.println("Pizza removida com sucesso!");
    }
}

