package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        /*BusinessCard businessCard = new BusinessCard(BusinessCardType.LAID, BusinessCardColor.GREY, BusinessCardSides.DOUBLE, Orientation.LANDSCAPE);
        Stamp stamp = new Stamp(StampSize.LARGE, StampColor.RED);
        Cart cart = new Cart();
        cart.addProduct(stamp);
        cart.addProduct(businessCard);
        System.out.println(cart.getTotalPrice());
        cart.removeProduct(stamp);
        System.out.println(cart.getTotalPrice());
        businessCard.addImage(new ImageAperture(91,0,"test"));
        System.out.println(businessCard.price);*/
        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
