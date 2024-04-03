package Campeonato;
import java.util.UUID;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PartidasEquipes {
    ArrayList<Equipes> equipes = new ArrayList<>();
    private String idpartida;
    private String data;
    private Equipes equipe1;
    private Equipes equipe2;
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
        this.equipe1 = eq1;
    }

    public void setEq2(Equipes eq2) {
        this.equipe2 = eq2;
    }
    
    
    public void data(String datas){
        
        data = datas;
    }
    
    public void local(String estadio){
        local = estadio;
    }
    
    public void golseq1(){
        equipe1.setGols();
        equipe2.setGolsSofridos();
       
    }  
    
    public void golseq2(){
        equipe2.setGols();
        equipe1.setGolsSofridos();
    }

    public int getGolseq1() {
        return equipe1.getGols();
    }

    public int getGolseq2() {
        return equipe2.getGols();
    }

    public Equipes getEq1() {
        return equipe1;
    }

    public Equipes getEq2() {
        return equipe2;
    }

    public int getPtsEQ1() {
        return ptsEQ1;
    }

    public int getPtsEQ2() {
        return ptsEQ2;
    }
    

    public ArrayList<Equipes> getEquipes() {
        return equipes;
    }

    
    
    public void resultado(){
        if(equipe1.getGols() > equipe2.getGols()){
        equipe1.setPontos(3);
        equipe1.setVitorias();
        equipe2.setDerrotas();
        resultado = "equipe vencedora: " + equipe1 + "\n pontos: " + equipe1.getPontos();



        }
        else if(equipe1.getGols() == equipe2.getGols()){
            resultado = "empate";
            equipe1.setPontos(1);
            equipe2.setPontos(1);
            equipe1.setEmpates();
            equipe2.setEmpates();
        }
        else{
            equipe2.setPontos(3);        
            equipe2.setVitorias();
            equipe1.setDerrotas();
            resultado = "equipe vencedora: " + equipe2 + "\n pontos: " + equipe2.getPontos();

        }
        JOptionPane.showMessageDialog (null, resultado);
    }
    public void resultado2(){
        if(equipe1.getGols() > equipe2.getGols()){
        resultado = "equipe vencedora: " + equipe1 + "\n pontos: " + equipe1.getPontos();


        }
        else if(equipe1.getGols() == equipe2.getGols()){ 
            resultado = "empate";
        }
        else{
            resultado = "equipe vencedora: " + equipe2 + "\n pontos: " + equipe2.getPontos();
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
        return "Partida: \n" + "equipe 1: " + equipe1 + ", equipe2=" + equipe2;
    }
    

    
}