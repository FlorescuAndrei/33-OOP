package com.andrei.oop_components.composition;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int cardSlots;
    private String bios;


    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
