package task1;

public class Product {
    private String name;
    private int price;
    private String expirationDate;

    public Product(String name, int price, String expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString(){
        return "Product: " + name + "\nPrice: " + price + "\nExpiration date: " + expirationDate;
    }

}
