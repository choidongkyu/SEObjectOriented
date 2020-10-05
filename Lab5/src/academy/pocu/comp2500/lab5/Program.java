package academy.pocu.comp2500.lab5;

public class Program {

    public static void main(String[] args) {
        Gladiator gladiator0 = new Gladiator("Dragonborn Whiterun", 100, 250, 10);
        Gladiator gladiator1 = new Gladiator("Ulfric Stormcloak", 1000, 300, 77);
        Move move = new Move("Hadoken", 120, 20);

        gladiator0.addMove(move); // true

        gladiator0.attack("Hadoken", gladiator1);

        System.out.println(gladiator1.getHp()); // 806
    }
}
