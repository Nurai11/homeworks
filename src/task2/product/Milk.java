package task2.product;

public class Milk {
    private String name;
    private String color;
    private int liter;

    private Milk(String name, String color, int liter) {
        this.name = name;
        this.color = color;
        this.liter = liter;
    }

    @Override
    public String toString() {
        return name + " " + color + " " + liter;
    }
}
