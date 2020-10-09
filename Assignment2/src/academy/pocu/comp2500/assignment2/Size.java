package academy.pocu.comp2500.assignment2;

public class Size {
    private int heigth;
    private int width;

    public Size(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getWidth() {
        return width;
    }

    public boolean isEquals(Size size) {
        return this.width == size.width && this.heigth == size.heigth;
    }
}
