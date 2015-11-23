package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guto Leoni
 */
public class Subway {

    private ArrayList<Sanduiche> sanduiche = new ArrayList<>();
    
    public ArrayList<Sanduiche> getSanduiche() {
        return sanduiche;
    }

    public void setSanduiche(ArrayList<Sanduiche> sanduiche) {
        this.sanduiche = sanduiche;
    }

    /**
     * Método que checa se as checkboxes foram clicadas, preenche um arraylist
     * com os itens "true"
     *
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @param item5
     * @param item6
     * @param item7
     * @return ArrayList
     */
    public ArrayList checaItem(boolean item1, boolean item2, boolean item3,
            boolean item4, boolean item5, boolean item6, boolean item7) {

        ArrayList<Boolean> item = new ArrayList<>();
        
            item.add(item1);
            item.add(item2);
            item.add(item3);
            item.add(item4);
            item.add(item5);
            item.add(item6);
            item.add(item7);

        
        return item;
    }
    
    public List getBrands() {
        
        List brands = new ArrayList();
        float preco = this.preco();
        String itens = this.itensPedidos();
        
        brands.add("<div class=\"row\">\n" +
"			<div class=\"col-sm-12\">\n" +
"				<img alt=\"Brand\" src=\"bootstrap/img/banner.png\" class=\"img-responsive\">\n" +
"			</div>\n" +
"		</div>\n" +
"		\n" +
"		<div id = \"main\">\n" +
"		\n" +
"		<div class=\"row\">\n" +
"			<div class=\"col-md-4\">\n" + 
"			</div>\n" +
"			<div class=\"col-md-4\">\n"+ 
                        "<h2>Itens marcados:</h2>\n"+ itens +
"			<h2>O preço do seu Subway é de apenas <b>R$ "+preco+"\n</b><br>"+
                        "<br>Puta merda! Que barato!! 8) </h2>\n" +
"			</div>\n" +
"		</div>\n");
        
        return brands;
    }
    
    
    private float preco(){
    
        float preco=0;
        int tamanho=0;
                
        for (Boolean adicional : sanduiche.get(0).getAdicionais()) {
            if(adicional) preco+=2.75;    
        }
        
        if (sanduiche.get(0).getTamanho()==30) tamanho=8;
        if (sanduiche.get(0).getRecheio().equals("Frango Teriaki"))        preco += 10 + tamanho;
        if (sanduiche.get(0).getRecheio().equals("B.M.T."))            preco += 12.75 + tamanho;
        if (sanduiche.get(0).getRecheio().equals("Frango e Bacon Sublime"))        preco += 12 + tamanho;
        if (sanduiche.get(0).getRecheio().equals("Vegetariano"))    preco += 8 + tamanho;
        if (sanduiche.get(0).getRecheio().equals("Italiano"))       preco += 11 + tamanho;        

        return preco;
    }
    
    private String itensPedidos(){
    
        String itens="";
        
        itens+="<b>Tipo do pão:</b> "+sanduiche.get(0).getTipoPao()+";<br>";
        itens+="<b>Tamanho:</b> "+sanduiche.get(0).getTamanho()+" cm;<br>";
        itens+="<b>Recheio:</b> "+sanduiche.get(0).getRecheio()+";<br>";
        itens+="<b>Tipo do Queijo:</b> "+sanduiche.get(0).getQueijo()+";<br>";
        itens+="<b>Adicionais:</b> ";
        
        if(sanduiche.get(0).getAdicionais().contains(true)){
            if(sanduiche.get(0).getAdicionais().get(0)) itens+="Bacon; "; 
            if(sanduiche.get(0).getAdicionais().get(1)) itens+="Tomate Seco; ";
            if(sanduiche.get(0).getAdicionais().get(2)) itens+="Cream Cheese; ";
        } else{
            itens+="Nada consta; ";
        }
            
        itens+="<br><b>Vegetais:</b> ";
        if(sanduiche.get(0).getVegetais().contains(true)){
            if(sanduiche.get(0).getVegetais().get(0)) itens+="Alface; "; 
            if(sanduiche.get(0).getVegetais().get(1)) itens+="Tomate; ";
            if(sanduiche.get(0).getVegetais().get(2)) itens+="Rucula; ";
            if(sanduiche.get(0).getVegetais().get(3)) itens+="Pimentao; "; 
            if(sanduiche.get(0).getVegetais().get(4)) itens+="Pepino; ";
            if(sanduiche.get(0).getVegetais().get(5)) itens+="Cebola; ";
            if(sanduiche.get(0).getVegetais().get(6)) itens+="Azeitona; ";
        } else{
            itens+="Nada consta; ";
        }
        
        itens+="<br><b>Molhos:</b> ";
        if(sanduiche.get(0).getMolhos().contains(true)){
            if(sanduiche.get(0).getMolhos().get(0)) itens+="Chipotle; "; 
            if(sanduiche.get(0).getMolhos().get(1)) itens+="Parmesão; ";
            if(sanduiche.get(0).getMolhos().get(2)) itens+="Babercue; ";
            if(sanduiche.get(0).getMolhos().get(3)) itens+="Maionese; "; 
            if(sanduiche.get(0).getMolhos().get(4)) itens+="Cebola Agridoce; ";
            if(sanduiche.get(0).getMolhos().get(5)) itens+="Mostarda; ";
        } else{
            itens+="Nada consta; ";
        }
        
        return itens;
    }
    
}
