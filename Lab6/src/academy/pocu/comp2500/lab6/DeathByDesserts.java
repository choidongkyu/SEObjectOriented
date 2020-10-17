package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class DeathByDesserts extends Combo{
    private static final int PRICE = 20;
    private ArrayList<Dessert> desserts = new ArrayList<>();

    public DeathByDesserts() {
        super(PRICE);
    }

    public ArrayList<Dessert> getDesserts() {
        return this.desserts;
    }

    public void setDesserts(Dessert dessert1, Dessert dessert2, Dessert dessert3, Dessert dessert4) {
        this.desserts.clear();

        this.desserts.add(dessert1);
        this.desserts.add(dessert2);
        this.desserts.add(dessert3);
        this.desserts.add(dessert4);
        this.isAdded = true;
    }

    /*public ArrayList<Dessert> getDesserts() {
        return super.desserts;
    }*/

    /*public void setDesserts(Dessert dessert1, Dessert dessert2, Dessert dessert3, Dessert dessert4) {
        super.desserts.clear();

        super.desserts.add(dessert1);
        super.desserts.add(dessert2);
        super.desserts.add(dessert3);
        super.desserts.add(dessert4);
        super.isAdded = true;
    }*/
}
