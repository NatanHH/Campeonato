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

    public void editarequipe(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do técnico", "Edição da equipe");
    }

    public String getNomeintrutor() {
        return nomeTecnico;
    }
    
    public void addjogador(){
    String nome = JOptionPane.showInputDialog(null, "Digite o nome do jogador", "Cadastro de jogadores");
    String posicao = JOptionPane.showInputDialog(null, "Digite a posição dele", "Cadastro de jogadores");
    int nume = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do jogador", "cadastro de jogadores"));
    
    Jogador j = new Jogador(nome,posicao,nume);
    jogadores.add(j);
   
    }

    public void editjogador(){
        Object[] j = jogadores.toArray();

        Jogador jo = (Jogador)JOptionPane.showInputDialog(null, "qual o jogador ?", "Jogadores", JOptionPane.QUESTION_MESSAGE, null, j, j);
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do jogador", "Edição de jogadores");
        String posicao = JOptionPane.showInputDialog(null, "Digite a posição dele", "Edição de jogadores");
        int nume = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do jogador", "Edição de jogadores"));
        jo.setNume(nume);
        jo.setNome(nome);
        jo.setPosicao(posicao);

            
    }
    public void removejogador(){
        Object[] j = jogadores.toArray();     
        Jogador jo = (Jogador)JOptionPane.showInputDialog(null, "qual o jogador ?", "Jogadores", JOptionPane.QUESTION_MESSAGE, null, j, j);
        jogadores.remove(jo);
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

    @Override
    public String toString() {
        return "nome da equipe= " + nomeequi + ", nome do Tecnico=" + nomeTecnico;
    }
    
    public void listarJogadores(){
         for(Jogador e : jogadores){
           JOptionPane.showMessageDialog(null, e, "jogadores", 1);
    }
    
    
    
}
}