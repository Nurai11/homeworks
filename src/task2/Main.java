package task2;

import task2.product.Milk;
import task2.product.Tea;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        Tea tea = new Tea("Tea", 200);
//        Milk milk = new Milk("Milk", "white", 1);
        System.out.println("Не знаю, правильно ли я сделала, так как модификаторы вообщем применила" +
                " в свойствах и в конструкции. В Milk ошибка, потому что Private(доступ только к своему классу)" +
                " А в Tea выходит ошибка, потому-что Main не в product..");
    }
}
