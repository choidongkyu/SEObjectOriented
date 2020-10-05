package academy.pocu.comp2500.lab5;

public class Move {
    private String skillName;
    private int power;
    private int maxValue;
    private int value;

    public Move(String skillName, int power, int maxValue) {
        this.skillName = skillName;
        this.power = power;
        this.maxValue = maxValue;
        this.value = maxValue;
    }

    public String getSkillName() {
        return skillName;
    }

    public int getPower() {
        return power;
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

    public void setValue(int value) {
        this.value = value;
    }
}
