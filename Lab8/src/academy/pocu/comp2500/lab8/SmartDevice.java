package academy.pocu.comp2500.lab8;

public abstract class SmartDevice {
    protected boolean isRunning = false;
    protected int tick;
    protected int lastUpdateTick;

    public boolean isOn() {
        return isRunning;
    }
    public abstract void onTick();

    public int getTicksSinceLastUpdate() {
        return tick - lastUpdateTick;
    }
}
