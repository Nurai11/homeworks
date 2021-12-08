package second.ex;


public class Shape {
    private char symbol;

    public void draw() {
        for (int x = 1; x < 5; x++) {
            for (int z = 1; z < 15; z++) {
                System.out.print(getSymbol());
            }
            System.out.println();
        }
    }


    public Shape(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

}
