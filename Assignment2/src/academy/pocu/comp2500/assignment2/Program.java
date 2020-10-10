package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class Program {

    public static void main(String[] args) {
        BusinessCard businessCard = new BusinessCard(BusinessCardType.LAID, BusinessCardColor.GREY,
                BusinessCardSides.SINGLE, Orientation.LANDSCAPE, DeliveryMethod.PICKUP);

        System.out.println(businessCard.getBusinessCardSides());
        businessCard.getColor();
        System.out.println(businessCard.getSize().getWidth());
        System.out.println(businessCard.getSize().getHeigth());
        System.out.println(businessCard.price);

        Cart cart = new Cart();
        cart.addProduct(businessCard);
        System.out.println(cart.getTotalPrice());
        businessCard.setDeliveryMethod(DeliveryMethod.SHIP);

        businessCard.addText(new TextAperture(-1, 0, "text", new Size(1, 1)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(90, 0, "text", new Size(1, 1)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(0, 50, "text", new Size(1, 1)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(-10, 0, "text", new Size(10, 10)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(0, -10, "text", new Size(10, 10)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(90, 0, "text", new Size(10, 10)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(0, 50, "text", new Size(10, 10)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(0, 0, "text", new Size(1, 1)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(89, 49, "text", new Size(1, 1)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(-9, -9, "text", new Size(10, 10)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(89, 49, "text", new Size(10, 10)));
        System.out.println(businessCard.getPrice());

        businessCard.addText(new TextAperture(0, 0, "text", new Size(90, 50)));
        System.out.println(businessCard.getPrice());

        businessCard.addImage(new ImageAperture(0, 0, "ImagePath", new Size(90, 50)));
        System.out.println(businessCard.getPrice());

        System.out.println(businessCard.getDisplayName());

    }
}
