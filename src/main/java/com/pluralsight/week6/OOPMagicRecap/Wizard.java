package com.pluralsight.week6.OOPMagicRecap;

public class Wizard {
    static String school = "Hogwarts";
    private String name;
    private String house;
    private int powerLevel;
    private String wandType;

    public Wizard(String name, String house, int powerLevel, String wandType) {
        this.name = name;
        this.house = house;
        this.powerLevel = powerLevel;
        this.wandType = wandType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String castSpell(String spell){
       return name + " from " + house + " casts " + spell +"!";
    }
}
