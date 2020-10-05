package academy.pocu.comp2500.lab5;

import java.util.UUID;

public class Barbarian {
    private String name;
    protected int attack;
    protected int defense;
    protected int maxHp;
    protected int hp;
    protected boolean isAlive;

    public Barbarian(String name, int hp, int attack, int defense) {
        this.name = name;
        this.maxHp = hp;
        this.hp = this.maxHp;
        this.attack = attack;
        this.defense = defense;
        isAlive = true;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Barbarian enemy) {
        if (!isAlive) {
            return;
        }

        double damage = ((double) this.attack - enemy.defense) / 2;
        enemy.hp = enemy.hp - (int) damage;
        if (enemy.hp <= 0) {
            enemy.hp = 0;
            enemy.isAlive = false;
        }
    }

    public boolean isAlive() {
        return this.isAlive;
    }
}
