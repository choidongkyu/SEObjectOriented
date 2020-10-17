package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class DeathByDesserts extends Combo {
    private static final int PRICE = 20;

    public DeathByDesserts() {
        super(PRICE);
    }


    public void setDesserts(Dessert dessert1, Dessert dessert2, Dessert dessert3, Dessert dessert4) {
        super.desserts.clear();

        super.desserts.add(dessert1);
        super.desserts.add(dessert2);
        super.desserts.add(dessert3);
        super.desserts.add(dessert4);
        super.isAdded = true;
    }
}
