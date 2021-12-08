package com.company;

public class Krul extends Human{
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


   public Krul(String can, int maxLifeSpan, boolean canFeel, int age) {
        super(can, maxLifeSpan, canFeel);
        this.age = age;
    }

}
