package Campeonato;


public class Jogador {
    private String nome;
    private String posicao;
    private int nume;
    private boolean estaTime;

    public Jogador(String nome, String posicao, int nume) {
        this.nome = nome;
        this.posicao = posicao;
        this.nume = nume;
        
        
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNume() {
        return nume;
    }

    public void setNume(int nume) {
        this.nume = nume;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstaTime(){
        estaTime = true;
    }
    @Override
    public String toString() {
        return "Jogador: \n " + "nome: " + nome + ", posicao: " + posicao + ", numero: " + nume;
    }
    
    
    
    
}