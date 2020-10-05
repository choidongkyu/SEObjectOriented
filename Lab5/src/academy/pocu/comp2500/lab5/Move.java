package academy.pocu.comp2500.lab5;

public class Move {
    String skillName;
    int power;
    int maxValue;
    int value;

    public Move(String skillName, int power, int maxValue) {
        this.skillName = skillName;
        this.power = power;
        this.maxValue = maxValue;
        this.value = maxValue;
    }

    public String getSkillName() {
        return skillName;
    }

    public boolean isSameMove(Move other) {
        return this.skillName.equals(other.skillName);
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getValue() {
        return value;
    }
}
