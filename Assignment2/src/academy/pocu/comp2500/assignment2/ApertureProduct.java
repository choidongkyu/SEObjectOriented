package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class ApertureProduct extends Product {
    private Orientation orientation;
    private ArrayList<Aperture> apertures;

    protected ApertureProduct(Size size, int price, Color color, Orientation orientation, DeliveryMethod deliveryMethod) {
        super(size, price, color, deliveryMethod);
        this.orientation = orientation;
        apertures = new ArrayList<>();
    }

    public void addAperture(Aperture aperture) {
        if (aperture.getX() + aperture.getSize().getWidth() <= 0 ||
                aperture.getX() >= super.size.getWidth()) {
            return;
        }

        if (aperture.getY() + aperture.getSize().getHeigth() <= 0 ||
                aperture.getY() >= super.size.getHeigth()) {
            return;
        }

        super.price += 5;
        apertures.add(aperture);
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public ArrayList<Aperture> getApertures() {
        return apertures;
    }

}
