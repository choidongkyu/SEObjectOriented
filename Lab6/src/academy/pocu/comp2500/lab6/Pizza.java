package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Pizza {
    protected ArrayList<Topping> toppings;
    private int price;
    protected boolean isAdded;

    public Pizza(int price) {
        this.toppings = new ArrayList<>();
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public ArrayList<Topping> getToppings() {
        return this.toppings;
    }
}
