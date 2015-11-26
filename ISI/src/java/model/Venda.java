/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Renan
 */
public class Venda {
    
    public String pao, recheio, queijo, adicionais, vegetais, molhos;
    public int tamanho, id;

    public Venda(int id, String pao, int tamanho, String recheio, String queijo, String adicionais, String vegetais, String molhos) {
        this.pao = pao;
        this.recheio = recheio;
        this.queijo = queijo;
        this.adicionais = adicionais;
        this.vegetais = vegetais;
        this.molhos = molhos;
        this.tamanho = tamanho;
        this.id = id;
    }
    
    
    
    
}
