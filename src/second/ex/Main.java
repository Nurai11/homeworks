package second.ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape('*');
        shape.draw();
        System.out.println( );
        Herringbone herringbone = new Herringbone('$');
        herringbone.draw();
        System.out.println( );
        Square square = new Square('$');
        square.draw();

    }
}
