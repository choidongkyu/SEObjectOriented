package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        MeatLoverPizza meatLoverPizza = new MeatLoverPizza();
        boolean isAdded = meatLoverPizza.addGreenPeppers(); // true
        System.out.println(isAdded);
        boolean isRemoved = meatLoverPizza.removeGreenPeppers(); // true
        System.out.println(isRemoved);
        isAdded = meatLoverPizza.addRedOnions(); // true
        System.out.println(isAdded);
        boolean isValid = meatLoverPizza.isValid(); // true
        System.out.println(isValid);
        int price = meatLoverPizza.getPrice(); // 21
        System.out.println(price);
        ArrayList<Topping> toppings = meatLoverPizza.getToppings();
    }
}
