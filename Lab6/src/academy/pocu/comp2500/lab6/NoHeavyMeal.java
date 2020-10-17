package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class NoHeavyMeal extends Combo{
    private static final int PRICE = 15;

    private ArrayList<Appetizer> appetizers = new ArrayList<>();
    private Dessert dessert;

    public NoHeavyMeal() {
        super(PRICE);
    }

    /*private boolean isMax() {
        return this.appetizers.size() == 2 && this.desserts.size() != 0;
    }*/

    private boolean isMax() {
        return this.appetizers.size() == 2 && this.dessert != null;
    }

    public void setAppetizers(Appetizer appetizer1, Appetizer appetizer2) {
        this.appetizers.clear();

        this.appetizers.add(appetizer1);
        this.appetizers.add(appetizer2);
        super.isAdded = isMax();
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
        super.isAdded = isMax();
    }

    public ArrayList<Appetizer> getAppetizers() {
        return this.appetizers;
    }

    public Dessert getDessert() {
        assert (this.dessert != null) : "call isValid() first!";
        return this.dessert;
    }

    /*public void setDessert(Dessert dessert) {
        if(super.desserts.size() == 0){
            super.desserts.add(dessert);
        }else {
            super.desserts.set(0, dessert);
        }

        super.isAdded = isMax();
    }*/
}
