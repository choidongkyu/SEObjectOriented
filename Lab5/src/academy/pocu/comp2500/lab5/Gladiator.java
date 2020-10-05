package academy.pocu.comp2500.lab5;

import java.util.ArrayList;

public class Gladiator extends Barbarian {
    private final ArrayList<Move> moves;

    public Gladiator(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
        moves = new ArrayList<>();
    }

    public boolean addMove(Move move) {
        for (Move a : moves) {
            if (a.isSameMove(move)) {
                return false;
            }
        }
        return moves.add(move);
    }

    public boolean removeMove(String skill) {
        for (Move a : moves) {
            if (a.getSkillName().equals(skill)) {
                return moves.remove(a);
            }
        }
        return false;
    }

    public void attack(String skill, Barbarian enemy) {
        if (!isAlive()) {
            return;
        }
        for (Move a : moves) {
            if (a.getSkillName().equals(skill)) {
                if (a.getValue() == 0) {
                    return;
                }
                double damage = ((double) super.attack / enemy.defense) * a.getPower() / 2;
                if (damage < 1) {
                    damage = 1;
                }
                enemy.hp = (enemy.hp - (int) damage);
                if (enemy.hp <= 0) {
                    enemy.isAlive = false;
                }
                a.setValue(a.getValue() - 1);
                return;
            }
        }
    }

    public void rest() {
        if (!isAlive()) {
            return;
        }
        if (super.hp < super.maxHp) {
            super.hp += 10;
            super.hp = Math.min(maxHp, Math.max(0, hp));
        }
        for (Move a : moves) {
            if (a.getValue() < a.getMaxValue()) {
                a.setValue(a.getValue() + 1);
            }
        }
    }
}
