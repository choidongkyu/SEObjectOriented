package academy.pocu.comp2500.lab6;

public class ThreeCourseMeal extends Combo {
    private static final int PRICE = 25;
    private Appetizer appetizer;
    private MainCourse mainCourse;
    private Dessert dessert;

    public ThreeCourseMeal() {
        super(PRICE);
    }

    /*private boolean isMax() {
        return super.appetizers.size() != 0 && super.mainCourse != null && super.desserts.size() != 0;
    }*/
    private boolean isMax() {
        return this.appetizer != null && this.mainCourse != null && this.dessert != null;
    }

    public Appetizer getAppetizer() {
        assert (this.appetizer != null) : "call isValid() first!";
        return this.appetizer;
    }

    public MainCourse getMainCourse() {
        assert (this.mainCourse != null) : "call isValid() first!";
        return this.mainCourse;
    }

    public Dessert getDessert() {
        assert (this.dessert != null) : "call isValid() first!";
        return this.dessert;
    }


    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
        super.isAdded = isMax();
    }

    public void setAppetizer(Appetizer appetizer) {
        this.appetizer = appetizer;
        super.isAdded = isMax();
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
        super.isAdded = isMax();
    }
}
