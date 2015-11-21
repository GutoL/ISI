package model;

import java.util.ArrayList;

/**
 *
 * @author Leylane
 */
public final class Sanduiche {

    private String tipoPao;
    private int tamanho;
    private String recheio;
    private String queijo;

    private ArrayList<Boolean> adicionais;
    private ArrayList<Boolean> vegetais;
    private ArrayList<Boolean> molhos;
    
   public Sanduiche(String tipoPao, int tamanho, String recheio, String queijo, 
           ArrayList<Boolean> adicionais,ArrayList<Boolean> vegetais, ArrayList<Boolean> molhos){
       
       this.tipoPao = tipoPao;
       this.tamanho = tamanho;
       this.recheio = recheio;
       this.queijo = queijo;
       
       this.adicionais = adicionais;
       this.vegetais = vegetais;
       this.molhos = molhos;
       
       setTipoPao(tipoPao);
       setTamanho(tamanho);
       setRecheio(recheio);
       setQueijo(queijo);
       setAdicionais(adicionais);
       setVegetais(vegetais);
       setMolhos(molhos);
   }

    public Sanduiche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public ArrayList<Boolean> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(ArrayList<Boolean> adicionais) {
        this.adicionais = adicionais;
    }

    public ArrayList<Boolean> getVegetais() {
        return vegetais;
    }

    public void setVegetais(ArrayList<Boolean> vegetais) {
        this.vegetais = vegetais;
    }

    public ArrayList<Boolean> getMolhos() {
        return molhos;
    }

    public void setMolhos(ArrayList<Boolean> molhos) {
        this.molhos = molhos;
    }

}
