package Campeonato;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Campeonato {
    public static ArrayList<Equipes> equipes ;
    public static ArrayList<PartidasEquipes> partidas;

    public static void main(String[] args) {
        
        partidas = new ArrayList<>();
        equipes = new ArrayList<>();
        
        String[] opcoes = {"Cadastrar Equipes ", "Cadastrar Partida","Listar Equipes",
            "Editar Equipes", "Remover Equipe","Adicionar jogador","Partidas", "Classificação",
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
           else if (opselec == 3){
               editEquipe();
           }
           else if (opselec == 4){
               removerEquipe();
           }
           else if(opselec == 5){
               criarJogador();
           }
           else if (opselec == 6){
               registrarPartida();
        }
           else if (opselec == 7){
               classificacao();
        }
        }
        while(opselec != 8);

             
    }
    
      public static void cadastrarEq(){
        String nomeequi = JOptionPane.showInputDialog(null, "Digite o nome da equipe", "Cadastro de Equipes");
        String nomeins = JOptionPane.showInputDialog(null, "Digite o nome do instrutor", "Cadastro de Equipes");
        Equipes eq1 = new Equipes(nomeequi, nomeins);
        equipes.add(eq1);
        
   }

       public static void listarEquipes(){
       for(Equipes e : equipes){
           JOptionPane.showMessageDialog(null, e);
           e.listarJogadores();
       
    }
   }
    public static void editEquipe(){
       Object[] e = equipes.toArray();
       Equipes eq = (Equipes)JOptionPane.showInputDialog(null, "qual a equipes que deseja editar ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, e, e);
       
       String nomeeq = JOptionPane.showInputDialog(null, "Digite o nome da equipe", "Edição de Equipes");
       String nomeins = JOptionPane.showInputDialog(null, "Digite o nome do instrutor", "Edição de Equipes");
        
       eq.setNomeTecnico(nomeins);
       eq.setNomeequi(nomeeq);
   }
    public static void removerEquipe(){
        Object[] eq = equipes.toArray();
        Equipes equi = (Equipes)JOptionPane.showInputDialog(null, "qual a equipe que deseja remover ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, eq);
        equipes.remove(equi);
   }
   
    public static void cadastrarPart(){
        Object[] eq = equipes.toArray();
        
        PartidasEquipes p1 = new PartidasEquipes();
        p1.cadPartida();
     
        
        Equipes equi1 = (Equipes)JOptionPane.showInputDialog(null, "qual as equipes voce deseja competir ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, eq);
        p1.setEq1(equi1);        
        Equipes equi2 = (Equipes)JOptionPane.showInputDialog(null, "qual as equipes voce deseja competir ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, eq);
        p1.setEq2(equi2);
        partidas.add(p1);
                
    }
    public static void criarJogador(){
        Object[] eq = equipes.toArray();
        
        Equipes equip = (Equipes)JOptionPane.showInputDialog(null, "qual equipe deseja adicionar um jogador ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, eq);
        equip.addjogador();
        equipes.remove(equip);
        equipes.add(equip);
    }
    public static void registrarPartida(){
        Object[] p = partidas.toArray();
        Object[] e = equipes.toArray();
        String[] op = {"Gols", "Resultado", "Voltar"};
        String[] ops = {"Gol feito", "Total de gols", "Voltar"};
        String[] gol = {"Equipe 1 ", "Equipe 2"};
        PartidasEquipes part = (PartidasEquipes)JOptionPane.showInputDialog(null, "qual Partida deseja visualizar ?", "Partidas", JOptionPane.QUESTION_MESSAGE, null, p, p);
        int opsele = 0;
        do{
            opsele = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                    "Menu inicial", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, op, op);
            if(opsele == 0){
            int opse = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                    "Menu inicial", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, ops, ops);
                if(opse == 0){
                    int goleq = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                    "Menu inicial", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, gol, gol);
                        if(goleq == 0){
                            part.golseq1();
                        }
                        else{
                            part.golseq2();
                        }
            }
                if (opsele == 1){
                    JOptionPane.showMessageDialog(null, part.getGolseq1());
                    JOptionPane.showMessageDialog(null, part.getGolseq2());

                }
        }
            if(opsele == 1){
                part.resultado();
            }
            
        }
        while(opsele != 2);
    }
    public static void classificacao(){
        //Apenas mesnagem para mostrar as classificações e licar com alguns outros metodos como ponto, criar outros metodos como: gols marcados, gols sofridos, vitorias, epates e derrotas. Possivelmente terminavel em 2 horas.
    }
    public static void pontos(){
        Object [] p = partidas.toArray();
        ArrayList<PartidasEquipes> partidasa = new ArrayList<>();
        for(PartidasEquipes pa : partidas){
            for(PartidasEquipes par : partidas){
                if(pa.ptsresultado() > par.ptsresultado()){
                    partidasa.add(pa);
                }
        }
        }
    }
}