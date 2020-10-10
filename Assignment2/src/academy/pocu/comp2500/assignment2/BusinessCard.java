package academy.pocu.comp2500.assignment2;

public class BusinessCard extends ApertureProduct {
    private BusinessCardSides businessCardSides;

    public BusinessCard(BusinessCardType businessCardType, BusinessCardColor businessCardColor,
                        BusinessCardSides businessCardSides, Orientation orientation) {
        super(new Size(90, 50), getPrice(businessCardType, businessCardSides), getColor(businessCardColor), orientation);
        this.businessCardSides = businessCardSides;
    }

    private static int getPrice(BusinessCardType businessCardType, BusinessCardSides businessCardSides) {
        int price = 0;
        switch (businessCardType) {
            case LINEN:
                if (businessCardSides == BusinessCardSides.SINGLE) {
                    price = 110;
                } else {
                    price = 140;
                }
                break;

            case LAID:
                if (businessCardSides == BusinessCardSides.SINGLE) {
                    price = 120;
                } else {
                    price = 150;
                }
                break;

            case SMOOTH:
                if (businessCardSides == BusinessCardSides.SINGLE) {
                    price = 100;
                } else {
                    price = 130;
                }
                break;
        }
        return price;
    }

    private static Color getColor(BusinessCardColor businessCardColor) {
        Color color;
        switch (businessCardColor) {
            case GREY:
                color = new Color(0xE6, 0xE6, 0xE6);
                break;
            case IVORY:
                color = new Color(0xFF, 0xFF, 0xF0);
                break;
            case WHITE:
                color = new Color(0xFF, 0xFF, 0xFF);
                break;
            default:
                color = null;
                break;
        }
        return color;
    }



    public BusinessCardSides getBusinessCardSides() {
        return businessCardSides;
    }
}
