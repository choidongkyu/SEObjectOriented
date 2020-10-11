package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class ApertureProduct extends Product {
    private Orientation orientation;
    private ArrayList<ImageAperture> images;
    private ArrayList<TextAperture> texts;

    public ApertureProduct(Size size, int price, Color color, Orientation orientation, DeliveryMethod deliveryMethod) {
        super(size, price, color, deliveryMethod);
        this.orientation = orientation;
        images = new ArrayList<>();
        texts = new ArrayList<>();
    }

    public void addImage(ImageAperture image) {
        if (image.getX() + image.getSize().getWidth() <= 0 ||
                image.getX() >= super.size.getWidth()) {
            return;
        }

        if (image.getY() + image.getSize().getHeigth() <= 0 ||
                image.getY() >= super.size.getHeigth()) {
            return;
        }

        super.price += 5;
        images.add(image);
    }

    public void addText(TextAperture text) {
        if (text.getX() + text.getSize().getWidth() <= 0 ||
                text.getX() >= super.size.getWidth()) {
            return;
        }

        if (text.getY() + text.getSize().getHeigth() <= 0 ||
                text.getY() >= super.size.getHeigth()) {
            return;
        }

        super.price += 5;
        texts.add(text);
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public ArrayList<ImageAperture> getImages() {
        return images;
    }

    public ArrayList<TextAperture> getTexts() {
        return texts;
    }
}
