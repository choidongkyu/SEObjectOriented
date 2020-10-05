package academy.pocu.comp2500.lab5;

import academy.pocu.comp2500.lab5.*;

public class Program {

    public static void main(String[] args) {
        Gladiator gladiator0 = new Gladiator("Dragonborn Whiterun", 100, 250, 10);
        Gladiator gladiator1 = new Gladiator("Ulfric Stormcloak", 1000, 300, 77);
        Move move = new Move("Hadoken1", 120, 20);
        Move move1 = new Move("Hadoken2", 120, 20);
        Move move2 = new Move("Hadoke3", 120, 20);
        Move move3 = new Move("Hadoken", 120, 20);
        Move move4 = new Move("Hadoken5", 120, 20);
        Move move5 = new Move("Hadoke", 120, 20);
        System.out.println(gladiator0.addMove(move)); // true
        System.out.println(gladiator0.addMove(move1)); // true
        System.out.println(gladiator0.addMove(move2)); // true
        System.out.println(gladiator0.addMove(move3)); // true
        System.out.println(gladiator0.addMove(move4)); // true
        System.out.println(gladiator0.addMove(move5)); // true

        gladiator0.attack("Hadoken5", gladiator1);

        System.out.println(gladiator1.getHp()); // 806
    }
}
