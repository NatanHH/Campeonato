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
    private int ptsEQ1;
    private int ptsEQ2;
   

    

    public PartidasEquipes() {
        this.idpartida = UUID.randomUUID().toString();
       
        
    }

    public String getData() {
        return data;
    }



    public void setEq1(Equipes eq1) {
        this.eq1 = eq1.getNomeequi();
    }

    public void setEq2(Equipes eq2) {
        this.eq2 = eq2.getNomeequi();
    }
    
    
    public void data(String datas){
        
        data = datas;
    }
    
    public void local(String estadio){
        local = estadio;
    }
    
    public void golseq1(){
        golseq1++;
       
    }  
    
    public void golseq2(){
        golseq2++;
    }

    public int getGolseq1() {
        return golseq1;
    }

    public int getGolseq2() {
        return golseq2;
    }

    public String getEq1() {
        return eq1;
    }

    public String getEq2() {
        return eq2;
    }

    public ArrayList<Equipes> getEquipes() {
        return equipes;
    }
    
    
    
    
    
    public void resultado(){
        if(golseq1 > golseq2){
        resultado = "equipe vencedora: " + eq1;
        ptsEQ1 += 3;
        }
        else if(golseq1 == golseq2){
            resultado = "empate";
            ptsEQ1 += 1;
            ptsEQ2 += 1;
        }
        else{
            resultado = "equipe vencedora: " + eq2;
            ptsEQ2 += 3;
        }
        JOptionPane.showMessageDialog (null, resultado);
    }
    
    public int ptsresultado(){
       if(golseq1 > golseq2){
        return ptsEQ1;
        }
        else if(golseq1 == golseq2){
            return ptsEQ1 + ptsEQ2;
        }
        else{
            return ptsEQ2;
        }
    }
    


    @Override
    public String toString() {
        return "Partida: " + "equipe1=" + eq1 + ", equipe2=" + eq2;
    }
    

    
}