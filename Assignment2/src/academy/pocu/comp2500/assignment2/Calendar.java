package academy.pocu.comp2500.assignment2;

public class Calendar extends Product {
    private CalendarType type;

    public Calendar(CalendarType calendarType, int height, int width, int price) {
        super(getSize(calendarType), getPrice(calendarType), new Color(0xFF, 0xFF, 0xFF));
        this.type = calendarType;
    }

    public CalendarType getType() {
        return type;
    }

    static private Size getSize(CalendarType calendarType) {
        Size size = null;
        switch (calendarType) {
            case WALL:
                size = new Size(400, 400);
                break;

            case DESK:
                size = new Size(200, 150);
                break;

            case MAGNET:
                size = new Size(100, 200);
                break;
        }
        return size;
    }

    static private int getPrice(CalendarType calendarType) {
        int price = 0;
        switch (calendarType) {
            case WALL:
            case DESK:
                price = 1000;
                break;
            case MAGNET:
                price = 1500;
                break;
        }
        return price;
    }
}
