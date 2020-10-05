package academy.pocu.comp2500.lab5;

public class Knight extends Gladiator {
    private Pet pet;
    private boolean isTogether = false;

    public Knight(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
        this.pet = null;
    }

    public void setPet(Pet pet) {
        if (pet == null) {
            isTogether = false;
            return;
        }
        isTogether = true;
        this.pet = pet;
    }

    public void attackTogether(Barbarian enemy) {
        if (!isAlive() || this == enemy || !isTogether) {
            return;
        }
        double damage = ((double) this.attack + pet.getAttack() - enemy.defense) / 2;
        if (damage < 1) {
            damage = 1;
        }
        enemy.hp -= (int) damage;
        if (enemy.hp <= 0) {
            enemy.isAlive = false;
        }
    }
}
