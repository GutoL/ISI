package model;

import java.util.ArrayList;

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
        if (item1) {
            item.add(item1);
        }
        if (item2) {
            item.add(item2);
        }
        if (item3) {
            item.add(item3);
        }
        if (item4) {
            item.add(item4);
        }
        if (item5) {
            item.add(item5);
        }
        if (item6) {
            item.add(item6);
        }
        if (item7) {
            item.add(item7);

        }
        return item;
    }

}
