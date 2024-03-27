package ex4;

    public class Jogador {
        
        private String nome;
        private int pontuacao;
        private int nivel;
    
        public Jogador(String nome, int pontuacao, int nivel) {
            this.nome = nome;
            this.pontuacao = pontuacao;
            this.nivel = nivel;
        }
    
        public void aumentarPontuacao(int pontos) {
            if (pontos > 0) {
                pontuacao += pontos;
                System.out.println("Pontuação de " + nome + " aumentada em " + pontos + " pontos.");
            } else {
                System.out.println("Valor de pontuação inválido.");
            }
        }
    
        public void subirNivel() {
            nivel++;
            System.out.println("Parabéns, " + nome + "! Você subiu para o nível " + nivel + ".");
        }
    
        public void exibirInformacoes() {
            System.out.println("Nome do jogador: " + nome);
            System.out.println("Pontuação: " + pontuacao);
            System.out.println("Nível: " + nivel);
        }


}
