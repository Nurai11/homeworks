package com.company;

public class Computer {
    private Display display;
    private String brand;
    private String color;
    private HardDisk hardDisk;
    private Ram ram;
    private UsbPort[] ramList;
    private Keyboards keyboards;
    private User user;


    public Computer(Display display, String brand, String color, HardDisk hardDisk, Ram ram, UsbPort[] ramList, Keyboards keyboards) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.ramList = ramList;
        this.keyboards = keyboards;
    }

    public Computer(Display display) {
        this.display = display;
    }


    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk  hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public UsbPort[] getRamList() {
        return ramList;
    }

    public void setRamList(UsbPort[] ramList) {
        this.ramList = ramList;
    }

    public Keyboards getKeyboards(){
        return keyboards;
    }

    public void setKeyboards(Keyboards keyboards) {
        this.keyboards = keyboards;
    }

    @Override
    public String toString(){
        return  "Display: " + display + "\nBrand: " + brand + "\nColor: " + color + "\nHard Disk: " +
                hardDisk + "\nRam: " + ram + "\nUSB PORT: " + ramList + "Keyboard: " + keyboards;
    }
}
