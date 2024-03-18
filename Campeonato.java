package Campeonato;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Campeonato {
    public static ArrayList<Equipes> equipes ;
    public static ArrayList<PartidasEquipes> partidas;

    public static void main(String[] args) {
        
        partidas = new ArrayList<>();
        equipes = new ArrayList<>();
        
        String[] opcoes = {"Cadastrar Equipes", "Cadastrar Partida","Listar Equipes",
            "Editar Equipes",
             "Sair"};
        int opselec = 0;
        do{
           opselec = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                    "Menu inicial", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);
           
           if(opselec == 0){
            cadastrarEq();
           }
           else if(opselec == 1){
               cadastrarPart();
           }
           else if(opselec == 2){
               listarEquipes();
        }
        }
        while(opselec != 4);

             
    }
    
   public static void cadastrarEq(){
        String nomeequi = JOptionPane.showInputDialog(null, "Digite o nome da equipe", "Cadastro de Equipes");
        String nomeins = JOptionPane.showInputDialog(null, "Digite o nome do instrutor", "Cadastro de Equipes");
        Equipes eq1 = new Equipes(nomeequi, nomeins);
        equipes.add(eq1);
        
   }
   public static void cadastrarPart(){
       PartidasEquipes p1 = new PartidasEquipes();
       p1.cadPartida();
   }
   public static void listarEquipes(){
       for(Equipes e : equipes){
           JOptionPane.showMessageDialog(null, e);
           e.listarJogadores();
       
    }
   }
}
    
