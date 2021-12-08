package second.ex;

public class Square extends Shape{

    public Square(char symbol) {
        super(symbol);
    }

    public void draw() {
        for (int x = 1; x < 5; x++) {
            for (int z = 1; z < 10; z++) {
                System.out.print(getSymbol());
            }
            System.out.println();
        }
    }
}
