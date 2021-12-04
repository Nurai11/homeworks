package com.company;

public class Ram {
    private int size;
    private String manufacturer;

    public Ram(int size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString(){
        return "RAM: " + size + "GB" + "\nManufacturer: " + manufacturer;
    }

}
