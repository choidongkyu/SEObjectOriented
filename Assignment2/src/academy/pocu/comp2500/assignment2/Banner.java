package academy.pocu.comp2500.assignment2;

public class Banner extends ApertureProduct {
    private BannerType type;
    private String name;

    public Banner(BannerType type, BannerSize bannerSize, Color color, Orientation orientation, DeliveryMethod deliveryMethod) {
        super(getSize(bannerSize), getPrice(bannerSize, type), color, orientation, deliveryMethod);
        this.type = type;
        this.name = getDisplayName(type);
    }

    private static Size getSize(BannerSize bannerSize) {
        Size size = null;
        switch (bannerSize) {
            case SMALL:
                size = new Size(1000, 500);
                break;
            case MEDIUM:
                size = new Size(1000, 1000);
                break;
            case LARGE:
                size = new Size(2000, 500);
                break;
            case EXTRALARGE:
                size = new Size(3000, 1000);
                break;
        }
        return size;
    }

    static private int getPrice(BannerSize bannerSize, BannerType bannerType) {
        int price = 0;
        switch (bannerType) {
            case GLOSS:
                if (bannerSize == BannerSize.SMALL) {
                    price = 5000;
                } else if (bannerSize == BannerSize.MEDIUM) {
                    price = 5200;
                } else if (bannerSize == BannerSize.LARGE) {
                    price = 5300;
                } else {
                    price = 6000;
                }
                break;
            case SCRIM:
            case MESH:
                if (bannerSize == BannerSize.SMALL) {
                    price = 5100;
                } else if (bannerSize == BannerSize.MEDIUM) {
                    price = 5300;
                } else if (bannerSize == BannerSize.LARGE) {
                    price = 5400;
                } else {
                    price = 6100;
                }
                break;
        }
        return price;
    }

    static private String getDisplayName(BannerType bannerType) {
        String name = "";
        switch (bannerType) {
            case GLOSS:
                name = "Gloss Banner";
                break;
            case SCRIM:
                name = "Scrim Banner";
                break;
            case MESH:
                name = "Mesh Banner";
                break;
        }
        return name;
    }

    public String getName() {
        return name;
    }

    public BannerType getType() {
        return type;
    }


}
