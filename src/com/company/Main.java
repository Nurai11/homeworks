package com.company;

public class Main {

    public static void main(String[] args) {
        Display display = new Display(123, "USA", "Matrix");
        System.out.println(display);
        System.out.println( );

        User user = new User("ABC", "LOGIN", 20, "qwerty", false);
        System.out.println(user);
        System.out.println( );

        HardDisk hardDisk = new HardDisk(2000 , 4);
        System.out.println(hardDisk);
        System.out.println( );

        Keyboards keyboards = new Keyboards(true, true);
        System.out.println(keyboards);
        System.out.println( );

        Ram ram = new Ram(8, "USA");
        System.out.println(ram);
        System.out.println( );

        UsbPort usbPort = new UsbPort("2.0", "123456");
        System.out.println(usbPort);
    }
}
