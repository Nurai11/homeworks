package com.company;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Human can eat", 100, true);
        Krul krul = new Krul("Krul can sleep", 100, true, 18);
        Lisa lisa = new Lisa("Lisa can sing", 100, true, 17);
        System.out.println(human);
        System.out.println( );
        System.out.println(krul);
        System.out.println("She is " + krul.getAge());
        System.out.println( );
        System.out.println(lisa);
        System.out.println("She is " + lisa.getAge());

        System.out.println("Не смогла вообщем с toString и возраст вывести( ");

    }
}
