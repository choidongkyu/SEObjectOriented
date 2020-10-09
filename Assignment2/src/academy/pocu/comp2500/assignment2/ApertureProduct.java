package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class ApertureProduct extends Product {
    Orientation orientation;
    ArrayList<ImageAperture> imageApertures;
    ArrayList<TextAperture> textApertures;

    public ApertureProduct(Size size, int price, Color color, Orientation orientation) {
        super(size, price, color);
        this.orientation = orientation;
        imageApertures = new ArrayList<>();
        textApertures = new ArrayList<>();
    }

    public void addImage(ImageAperture imageAperture) {
        if (imageAperture.x < 0 || imageAperture.x > super.getSize().getWidth()) {
            return;
        }

        if (imageAperture.y < 0 || imageAperture.y > super.getSize().getHeigth()) {
            return;
        }
        super.price += 5;
        imageApertures.add(imageAperture);
    }

    public void addText(TextAperture textAperture) {
        super.price += 5;
        textApertures.add(textAperture);
    }
}
