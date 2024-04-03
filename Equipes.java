package Campeonato;

import java.util.ArrayList;

public class Equipes implements Comparable<Equipes>{

    private String nomeequi;
    private String nomeTecnico;
    private int pontos;
    private int gols;
    private int golsSofridos;
    private int vitorias;
    private int derrotas;
    private int empates;
    ArrayList<Jogador> jogadores = new ArrayList<>();

    public Equipes(String nomeequi, String nomeintrutor) {
        this.nomeequi = nomeequi;
        this.nomeTecnico = nomeintrutor;
    }


    public String getNomeintrutor() {
        return nomeTecnico;
    }

    public void addjogador(String nome, String posicao, int nume) {
        Jogador j = new Jogador(nome, posicao, nume);
        j.setEstaTime();
        jogadores.add(j);
    }

public void removejogador(Jogador jogador) {
    jogadores.remove(jogador);
}

    public String getNomeequi() {
        return nomeequi;
    }

    public void setNomeequi(String nomeequi) {
        this.nomeequi = nomeequi;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public int getGols() {
        return gols;
    }

    public void setGols() {
        this.gols++;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias() {
        this.vitorias++;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas() {
        this.derrotas++;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates() {
        this.empates++;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos() {
        this.golsSofridos++;
    }
    
    
    
    public String resultadoEquipe(){
        
        return "nome da equipe: " + nomeequi + "\n pontos da equipe: " + pontos +
                "\n gols marcados: " + gols + "\n gols sofridos: " + golsSofridos +
                "\n vitórias: " + vitorias + "\n derrotas: " + derrotas + "\n empates: " + empates;
    }

    

    @Override
    public String toString() {
        return "nome da equipe: " + nomeequi + ", nome do Tecnico: " + nomeTecnico;
    }

    @Override
    public int compareTo(Equipes outraEquipe) {
        return Integer.compare(outraEquipe.getPontos(), this.pontos);
    }


}