package Campeonato;
import java.util.UUID;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PartidasEquipes {
    ArrayList<Equipes> equipes = new ArrayList<>();
    private String idpartida;
    private String data;
    private String eq1;
    private String eq2;
    private String local;
    private int golseq1;
    private int golseq2;
    private String resultado;
   

    

    public PartidasEquipes() {
        this.idpartida = UUID.randomUUID().toString();
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    public void editEquipe(){
        Object[] e = equipes.toArray();
        Equipes eq = (Equipes)JOptionPane.showInputDialog(null, "qual a equipes que deseja editar ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, e, e);
        
        String nomeeq = JOptionPane.showInputDialog(null, "Digite o nome da equipe", "Edição de Equipes");
        String nomeins = JOptionPane.showInputDialog(null, "Digite o nome do instrutor", "Edição de Equipes");
        
        eq.setNomeTecnico(nomeins);
        eq.setNomeequi(nomeeq);
    }

    public void removeEquipe(){
        Object[] eq = equipes.toArray();
        Equipes equi = (Equipes)JOptionPane.showInputDialog(null, "qual a equipe que deseja remover ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, eq);
        equipes.remove(equi);
    }
    
    public void jogo(){
        Object[] eq = equipes.toArray();
        
        Equipes equi1 = (Equipes)JOptionPane.showInputDialog(null, "qual as equipes voce deseja competir ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, eq);
        eq1 = equi1.getNomeequi();
        
        Equipes equi2 = (Equipes)JOptionPane.showInputDialog(null, "qual as equipes voce deseja competir ?", "Equipes", JOptionPane.QUESTION_MESSAGE, null, eq, eq);
        eq2 = equi2.getNomeequi();
                
    }
    
    public void data(){
        String datas = JOptionPane.showInputDialog(null, "Digite a data que deseja realizar o jogo", "Data");
        data = datas;
    }
    
    public void local(){
        String estadio = JOptionPane.showInputDialog(null, "Digite o estadio que deseja realizar o jogo", "Local");
        local = estadio;
    }
    
    public void golseq1(){
        golseq1++;
    }  
    
    public void golseq2(){
        golseq2++;
    }
    
    public void resultado(){
        if(golseq1 > golseq2){
        resultado = "equipe vencedora: " + eq1;
        }
        else{
            resultado = "equipe vencedora: " + eq2;
        }
        JOptionPane.showMessageDialog (null, resultado);
    }
    
    public void cadPartida(){
        data();
        local();
    }
    
    public void listarEquipes(){
       for(Equipes e : equipes){
       JOptionPane.showMessageDialog(null, e);
    }
    
}
}