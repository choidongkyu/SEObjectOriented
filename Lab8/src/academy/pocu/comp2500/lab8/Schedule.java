package academy.pocu.comp2500.lab8;

public class Schedule {
    private int startTick;
    private int endTick;

    public Schedule(int startTick, int endTick) {
        this.startTick = startTick;
        this.endTick = endTick;
    }

    public int getStartTick() {
        return startTick;
    }

    public int getEndTick() {
        return endTick;
    }
}
