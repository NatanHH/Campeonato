package Campeonato;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Campeonato {

    public static ArrayList<Equipes> equipes;
    public static ArrayList<PartidasEquipes> partidas;

    public static void main(String[] args) {
        partidas = new ArrayList<>();
        equipes = new ArrayList<>();

        String[] opcoes = {"Cadastros ", "Editar", "Remover",
            "Partidas", "Classificação","listar Equipes",
            "Sair"};
        int opselec = 0;
        do {
            opselec = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                    "Menu inicial", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[6]);

            if (opselec == 0) {
                String[] cadastros = {
                    "Cadastrar Equipes", "Cadastrar Partidas", "Cadastro de Jogador"
                };
                int opcadastro;
                opcadastro = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                        "Criação", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, cadastros, null);
                if (opcadastro == 0) {
                cadastrarEq();

                } else if (opcadastro == 1) {
                    cadastrarPart();
                } else if (opcadastro == 2) {
                    criarJogador();
                }

            } else if (opselec == 1) {
                String[] editar = {
                    "Editar equipe", "Editar Jogador"
                };
                int opEdit;
                opEdit = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                        "Editar", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, editar, null);

                if (opEdit == 0) {
                    editEquipe();
                } else if (opEdit == 1) {
                    editJogador();
                }
            } else if (opselec == 2) {
                String[] remover = {
                    "Remover Equipe", "Remover Jogador"
                };
                int opRemover;
                opRemover = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                        "Remover", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, remover, null);
                if (opRemover == 0) {
                    removerEquipe();
                } else if (opRemover == 1) {
                    removerJogador();
                }
            } else if (opselec == 3) {
                registrarPartida();

            } else if (opselec == 4) {
                classificacao();

            }
            else if(opselec == 5){
                listarEquipes();
            }
        } while (opselec != 6);

    }

    public static void cadastrarEq() {
        String nomeequi = JOptionPane.showInputDialog(null, "Digite o nome da equipe", "Cadastro de Equipes");
        String nomeins = JOptionPane.showInputDialog(null, "Digite o nome do instrutor", "Cadastro de Equipes");
        Equipes eq1 = new Equipes(nomeequi, nomeins);
        equipes.add(eq1);

    }

    public static void listarEquipes() {
        for (Equipes e : equipes) {
            Object[] j = e.getJogadores().toArray();
            JOptionPane.showMessageDialog(null, e);

            JOptionPane.showMessageDialog(null, j);

        }
    }

    public static void editEquipe() {
        Object[] e = equipes.toArray();
        Equipes eq = (Equipes) JOptionPane.showInputDialog(null, "qual a equipes que deseja editar ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, e, null);

        String nomeeq = JOptionPane.showInputDialog(null, "Digite o nome da equipe", "Edição de Equipes");
        String nomeins = JOptionPane.showInputDialog(null, "Digite o nome do instrutor", "Edição de Equipes");

        eq.setNomeTecnico(nomeins);
        eq.setNomeequi(nomeeq);
    }

    public static void removerEquipe() {
        Object[] eq = equipes.toArray();
        Equipes equi = (Equipes) JOptionPane.showInputDialog(null, "qual a equipe que deseja remover ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, null);
        equipes.remove(equi);
    }

    public static void cadastrarPart() {
        Object[] eq = equipes.toArray();

        PartidasEquipes p1 = new PartidasEquipes();
        String datas = JOptionPane.showInputDialog(null, "Digite a data que deseja realizar o jogo", "Data");
        p1.data(datas);
        String estadio = JOptionPane.showInputDialog(null, "Digite o estadio que deseja realizar o jogo", "Local");
        p1.local(estadio);

        Equipes equi1 = (Equipes) JOptionPane.showInputDialog(null, "qual as equipes voce deseja competir ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, null);
        p1.setEq1(equi1);
        Equipes equi2 = (Equipes) JOptionPane.showInputDialog(null, "qual as equipes voce deseja competir ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, null);
        p1.setEq2(equi2);
        partidas.add(p1);

    }

    public static void criarJogador() {
        Object[] eq = equipes.toArray();

        Equipes equip = (Equipes) JOptionPane.showInputDialog(null, "qual equipe deseja adicionar um jogador ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, null);
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do jogador", "Cadastro de jogadores");
        String posicao = JOptionPane.showInputDialog(null, "Digite a posição dele", "Cadastro de jogadores");
        int nume = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do jogador", "cadastro de jogadores"));

        equip.addjogador(nome, posicao, nume);
        equipes.remove(equip);
        equipes.add(equip);

    }

    public static void registrarPartida() {
        Object[] p = partidas.toArray();
        String[] op = {"Gols", "Resultado", "Voltar"};
        String[] ops = {"Gol feito", "Total de gols", "Voltar"};
        String[] gol = {"Equipe 1 ", "Equipe 2"};
        int resultadospart = 0;
        PartidasEquipes part = (PartidasEquipes) JOptionPane.showInputDialog(null, "qual Partida deseja visualizar ?", "Partidas", JOptionPane.QUESTION_MESSAGE, null, p, null);
        int opsele = 0;
        do {
            opsele = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                    "Menu inicial", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, op, op);
            if (opsele == 0) {
                int opse = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                        "Menu inicial", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, ops, ops);
                if (opse == 0) {
                    int goleq = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                            "Menu inicial", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, gol, gol);
                    if (goleq == 0) {
                        part.golseq1();
                    } else {
                        part.golseq2();
                    }
                }
                if (opse == 1) {

                    JOptionPane.showMessageDialog(null, part.getGolseq1());
                    JOptionPane.showMessageDialog(null, part.getGolseq2());

                }
            }
            if (opsele == 1) {
                if(resultadospart < 1){
                part.resultado();
                resultadospart++;
            }
                else{
                    part.resultado2();
                }
            }

        } while (opsele != 2);
    }

    public static void classificacao() {
        Collections.sort(equipes);
        for (Equipes listarEquipes : equipes) {
            JOptionPane.showMessageDialog(null, listarEquipes.resultadoEquipe());
        }
    }

    public static void editJogador() {
        Object[] equipe = equipes.toArray();
        Equipes equi = (Equipes) JOptionPane.showInputDialog(null, "qual a equipe que editar um jogador ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, equipe, null);
        Object[] j = equi.getJogadores().toArray();

        Jogador jo = (Jogador) JOptionPane.showInputDialog(null, "qual o jogador ?", "Jogadores", JOptionPane.QUESTION_MESSAGE, null, j, null);
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do jogador", "Edição de jogadores");
        String posicao = JOptionPane.showInputDialog(null, "Digite a posição dele", "Edição de jogadores");
        int nume = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do jogador", "Edição de jogadores"));
        jo.setNume(nume);
        jo.setNome(nome);
        jo.setPosicao(posicao);

    }

    public static void removerJogador() {
        Object[] equipe = equipes.toArray();
        Equipes eq = (Equipes) JOptionPane.showInputDialog(null, "qual Equipe deseja remover um jogador", "Equipes", JOptionPane.QUESTION_MESSAGE, null, equipe, null);
        if (eq != null) {
            Object[] jogadores = eq.getJogadores().toArray();
            eq.getJogadores();
            Jogador jogadorSelecionado = (Jogador) JOptionPane.showInputDialog(null, "escolha um jogador", "jogadores", JOptionPane.QUESTION_MESSAGE, null, jogadores, null);
            eq.removejogador(jogadorSelecionado);
        }
    }
}
