package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        {
            NoHeavyMeal noHeavyMeal = new NoHeavyMeal();
            noHeavyMeal.setAppetizers(Appetizer.CALAMARI, Appetizer.GYOZA);
            noHeavyMeal.setDessert(Dessert.MANGO_PUDDING);
            ArrayList<Appetizer> appetizers = noHeavyMeal.getAppetizers();
            ArrayList<Dessert> desserts = noHeavyMeal.getDesserts();

            for(Appetizer a : appetizers) {
                System.out.println(a);
            }

            for(Dessert a : desserts) {
                System.out.println(a);
            }
        }
    }
}
