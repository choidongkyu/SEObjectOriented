package academy.pocu.comp2500.lab5;

import academy.pocu.comp2500.lab5.*;

public class Program {

    public static void main(String[] args) {
        Barbarian barbarian0 = new Barbarian("Dragonborn Whiterun", 250, 88, 10);

        barbarian0.attack(barbarian0);

        System.out.println(barbarian0.getHp()); //
    }
}
