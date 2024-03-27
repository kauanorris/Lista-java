package ex5;

    public class Carro {
        
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; 
    }

    public void acelerar() {
        velocidadeAtual += 10; 
        System.out.println("Carro acelerando. Nova velocidade: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual >= 10) { 
            velocidadeAtual -= 10; 
            System.out.println("Carro freando. Nova velocidade: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

}
