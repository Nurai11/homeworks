package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Модификаторы доступа - это ключевые слова, которые задают допустимую " +
                "видимость элементов класса из/для других классов(пакетов)");
        System.out.println("public, private, protected, default");
        System.out.println("Packages - это пакеты. Они нужны для того, чтобы разделить похожие классы.");
        System.out.println("Default - есть доступ в свой класс и пакет. Public - имеет доступ на все.");
        System.out.println("Если сеттер сделать private, кто-то не может поменять значение переменной." +
                " А public getter, чтобы просто получить данные. ");

    }
}
