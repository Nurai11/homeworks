package com.company;

public class Lisa extends Human{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Lisa(String can, int maxLifeSpan, boolean canFeel, int age) {
        super(can, maxLifeSpan, canFeel);
        this.age = age;
    }


}
