package academy.pocu.comp2500.assignment2;

public class ImageAperture {
    private int x;
    private int y;
    private Size size;
    private String imagePath;

    public ImageAperture(int x, int y, String imagePath, Size size) {
        this.x = x;
        this.y = y;
        this.imagePath = imagePath;
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
