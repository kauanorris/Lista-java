package ex8;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private List<Pizza> pizzas;
    private String enderecoEntrega;

    public Pedido() {
        this.pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void removerPizza(int indice) {
        if (indice >= 0 && indice < pizzas.size()) {
            pizzas.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public double calcularTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getValor();
        }
        return total;
    }

    public void exibirDetalhes() {
        System.out.println("Pedido:");
        for (int i = 0; i < pizzas.size(); i++) {
            Pizza pizza = pizzas.get(i);
            System.out.println("Pizza " + (i + 1) + ": " + pizza.getNome());
            System.out.println("Valor: R$" + pizza.getValor());
            System.out.println("Ingredientes: " + pizza.getIngredientes());
        }
        System.out.println("Endereço de entrega: " + enderecoEntrega);
        System.out.println("Total: R$" + calcularTotal());
    }
}

