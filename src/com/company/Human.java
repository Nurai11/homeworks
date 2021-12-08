package com.company;

public class Human {
    private String can;
    private int maxLifeSpan;
    private boolean canFeel;


    public Human(String can, int maxLifeSpan, boolean canFeel) {
        this.can = can;
        this.maxLifeSpan = maxLifeSpan;
        this.canFeel = canFeel;
    }

    @Override
    public String toString(){
        return can + "\nMaximum life span: " + maxLifeSpan + "\nCan feel: " + true;
    }

}
