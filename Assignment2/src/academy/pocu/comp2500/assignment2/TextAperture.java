package academy.pocu.comp2500.assignment2;

public class TextAperture {
    private int x;
    private int y;
    private Size size;
    private String text;

    public TextAperture(int x, int y, String text, Size size) {
        this.x = x;
        this.y = y;
        this.text = text;
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
