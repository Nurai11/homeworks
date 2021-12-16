package hw.twenty;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        //Задание А
        System.out.println("Прочесала весь инет, не нашла подходящего ответа," +
                "может можно было узнать здесь, но не знаю как");


        Circle circle = new Circle();
        System.out.println(circle.Square1(3.14));
        Circle.Square2(12, 3.14);

        System.out.println("1.final - это модификатор, который не позволяет изменить уже первый созданный элемент.");
        System.out.println("2. final можно использовать в классе, методе(как аргумент тоже), в поле");
        System.out.println("3. final не позволяет изменять примитивные данные, а состояние ссылки можно, но не саму ссылку");
        System.out.println("4. Ссылочный тип данных хранит в себе ссылку на объект. ");
        System.out.println("5. Примитивные типы у себя внутри хранят значение, а ссылочные – ссылку на объект. ");
    }
}
