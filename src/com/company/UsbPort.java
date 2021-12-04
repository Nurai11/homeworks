package com.company;

public class UsbPort {
    private String typeOfPort;
    private String idOfPort;

    public UsbPort(String typeOfPort, String idOfPort) {
        this.typeOfPort = typeOfPort;
        this.idOfPort = idOfPort;
    }

    public String getTypeOfPort() {
        return typeOfPort;
    }

    public void setTypeOfPort(String typeOfPort) {
        this.typeOfPort = typeOfPort;
    }

    public String getIdOfPort() {
        return idOfPort;
    }

    public void setIdOfPort(String idOfPort) {
        this.idOfPort = idOfPort;
    }

    @Override
    public String toString(){
        return "Type of port: " + typeOfPort + "\nId of port: " + idOfPort;
    }
}
