package second.ex;

public class Herringbone extends Shape {
    public Herringbone(char symbol) {
        super(symbol);
    }

    @Override
    public void draw() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= (6 - i); j++) {
                System.out.print(" ");
            }

            for (int x = 0; x < (i + (i - 1)); x++) {
                System.out.print(getSymbol());
            }

            for (int y = 1; y <= (6 - i); y++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
