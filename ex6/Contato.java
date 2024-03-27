package ex6;

import java.util.ArrayList;
import java.util.List;

class Agenda {
    
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso: " + contato);
    }

    public void removerContato(String nome) {
        Contato contatoARemover = null;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoARemover = contato;
                break;
            }
        }
        if (contatoARemover != null) {
            contatos.remove(contatoARemover);
            System.out.println("Contato removido com sucesso: " + contatoARemover);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void buscarContato(String nome) {
        boolean encontrado = false;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + contato);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia. Nenhum contato encontrado.");
        } else {
            System.out.println("Lista de contatos na agenda:");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}

