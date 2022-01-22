package homework27;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        Bake bread = new Bread();
        Draw circle = new Circle();

        bread.bakeBread();
        circle.drawCircle();

        System.out.println("Интерфейс - это конструкция языка Java, с помощью которого можно" +
                "наследовать не один раз, описывает поведение класса");
        System.out.println("Отличие обычного класса от интерфейса — в том, что класс состоит из интерфейса и реализации. ");
        System.out.println("Абстрактные классы наследуются, а интерфейсы реализуются");
        System.out.println("Интерфейс можно применять как свойство, тип ссылки, и можно наследовать");
        System.out.println("Ссылка - указатель на объект, который содержит адрес ячейки памяти, в которой хранится объект.");
        System.out.println("Например, как я поняла: Dad son = new Son(), (son наследуется от dad) или это неправильно?)");

    }
}
