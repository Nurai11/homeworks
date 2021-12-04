package com.company;

public class Display {
    private int size;
    private String manufacturer;
    private String typeOfMatrix;

    public Display(int size, String manufacturer, String typeOfMatrix) {
        this.size = size;
        this.manufacturer = manufacturer;
        this.typeOfMatrix = typeOfMatrix;
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

    public String getTypeOfMatrix() {
        return typeOfMatrix;
    }

    public void setTypeOfMatrix(String typeOfMatrix) {
        this.typeOfMatrix = typeOfMatrix;
    }

    @Override
    public  String toString() {
        return "Display size: " + size + "\nType of matrix: " + typeOfMatrix + "\nManufacturer:" + manufacturer;
    }
}
