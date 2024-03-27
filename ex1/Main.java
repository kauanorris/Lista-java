package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro numero: ");
        double num1 = Double.parseDouble(leitor.nextLine());

        System.out.print("Digite o segundo numero: ");
        double num2 = Double.parseDouble(leitor.nextLine());

        System.out.print("Digite a operação: ");
        char op = leitor.nextLine().charAt(0);

        double resultado = 0;

        if (op == '+') {
            resultado = calc.adicionar(num1, num2);

        }

        else if (op == '-') {
            resultado = calc.subtrair(num1, num2);
        }

        else if (op == '/') {
            resultado = calc.dividir(num1, num2);
        }

        else if (op == '*'){
            resultado = calc.multiplicar(num1, num2);
        }
        
        else{
            System.out.println("ERRO NAO FOI DIGITADA UMA OPICAO VALIDA");
        }

        System.out.print("O resultado é " + resultado);
        leitor.close();
    }

}
