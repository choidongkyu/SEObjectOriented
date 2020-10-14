package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        DeathByDesserts deathByDesserts = new DeathByDesserts();
        deathByDesserts.setDesserts(Dessert.GREEN_TEA_ICE_CREAM, Dessert.ITALIAN_DONUTS, Dessert.MANGO_PUDDING, Dessert.CHOCOLATE_MOUSSE);
        deathByDesserts.isValid(); // true
    }
}
