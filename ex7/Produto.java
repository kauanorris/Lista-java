package ex7;

public class Produto {
    
    private String nomeProduto;
    private int codigo;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nomeProduto, int codigo, double preco, int quantidadeEstoque){
        this.nomeProduto = nomeProduto;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }   

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionarEstoque(int quantidade){
        quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidadeEstoque >= quantidade) {
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nomeProduto + ", Código: " + codigo + ", Preço: R$" + preco + ", Quantidade em Estoque: " + quantidadeEstoque;
    }



    
}
