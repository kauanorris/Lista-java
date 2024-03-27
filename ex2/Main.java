package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Livro> biblioteca = new ArrayList<Livro>();

        for (int i = 0; i < 3; i++) {
            biblioteca.add(new Livro());
            System.out.print("Digite titulo: ");
            biblioteca.get(i).setTitulo(leitor.nextLine());
            System.out.print("Digite autor: ");
            biblioteca.get(i).setAutor(leitor.nextLine());
            System.out.print("Digite a data da publicação: ");
            biblioteca.get(i).setDatapubli(Integer.parseInt(leitor.nextLine()));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Livro " + (i+1));
            System.out.println("Titulo: " + biblioteca.get(i).getTitulo());
            System.out.println("Autor: " + biblioteca.get(i).getAutor());
            System.out.println("Data de Publicação: " + biblioteca.get(i).getDatapubli());
        }    

        leitor.close();

    }
}
