package task3.product;

public class Milk extends Product {
    private String color;
    private int liter;


    public Milk(String name, int price, String manufacturer, String color, int liter) {
        super(name, price, manufacturer);
        this.color = color;
        this.liter = liter;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + manufacturer + " " + color + " " + liter;
    }
}
