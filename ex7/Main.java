package ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Produto> estoque = new ArrayList<>();
    private static int codigoAtual = 1;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Gerar Relatório de Estoque");
            System.out.println("5. Sair");

            System.out.print("Opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarProduto(leitor);
                    break;
                case 2:
                    atualizarProduto(leitor);
                    break;
                case 3:
                    removerProduto(leitor);
                    break;
                case 4:
                    gerarRelatorioEstoque();
                    break;
                case 5:
                    System.out.println("Saindo do sistema de gerenciamento de estoque. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 5);

        leitor.close();
    }

    private static void adicionarProduto(Scanner leitor) {
        System.out.print("Digite o nome do produto: ");
        String nome = leitor.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = leitor.nextDouble();
        System.out.print("Digite a quantidade em estoque do produto: ");
        int quantidade = leitor.nextInt();

        Produto novoProduto = new Produto(nome, codigoAtual++, preco, quantidade);
        estoque.add(novoProduto);
        System.out.println("Produto adicionado com sucesso: " + novoProduto);
    }

    private static void atualizarProduto(Scanner leitor) {
        System.out.print("Digite o código do produto a ser atualizado: ");
        int codigo = leitor.nextInt();

        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                System.out.print("Digite o novo preço do produto: ");
                double novoPreco = leitor.nextDouble();
                produto.setPreco(novoPreco);

                System.out.print("Digite a nova quantidade em estoque do produto: ");
                int novaQuantidade = leitor.nextInt();
                produto.adicionarEstoque(novaQuantidade - produto.getQuantidadeEstoque());

                System.out.println("Produto atualizado com sucesso: " + produto);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private static void removerProduto(Scanner scanner) {
        System.out.print("Digite o código do produto a ser removido: ");
        int codigo = scanner.nextInt();

        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                estoque.remove(produto);
                System.out.println("Produto removido com sucesso: " + produto);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private static void gerarRelatorioEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio. Nenhum produto encontrado.");
        } else {
            System.out.println("Relatório de Estoque:");
            for (Produto produto : estoque) {
                System.out.println(produto);
            }
        }
    }
}
