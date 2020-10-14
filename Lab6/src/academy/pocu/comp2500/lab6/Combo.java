package academy.pocu.comp2500.lab6;

public class Combo {
    private int price;
    protected boolean isAdded;

    public Combo(int price) {
        this.price = price;
        this.isAdded = false;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean isValid() {
        return isAdded;
    }
}
