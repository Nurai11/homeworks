package task3.product;

public class Product {
    protected String name;
    protected int price;
    protected String manufacturer;

    public Product(String name, int price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + manufacturer;
    }
}
