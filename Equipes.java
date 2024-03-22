package Campeonato;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Equipes {

    private String nomeequi;
    private String nomeTecnico;
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
    

    @Override
    public String toString() {
        return "nome da equipe= " + nomeequi + ", nome do Tecnico=" + nomeTecnico;
    }


}