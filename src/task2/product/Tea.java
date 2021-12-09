package task2.product;

public class Tea {
    String name;
    int price;

    Tea(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + " " + price;
    }
}
