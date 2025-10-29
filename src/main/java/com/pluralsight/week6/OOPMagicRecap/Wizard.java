package com.pluralsight.week6.OOPMagicRecap;

public class Wizard {
    static String school = "Hogwarts";
    private String name;
    private String house;
    private int powerLevel;
    private String wandType;
    private Wand wand;

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    // car has engine
    // engine has different properties
    static void welcomeMessage(){
        System.out.println("Welcome to " + school + " of Witchcraft and Wizardry!");
    }
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

/**
 * 5. Static or Non-Static? (10 Quick Situations)
 * Mini Explanation
 *
 * Remember:
 *
 * Static = shared by all instances, belongs to the class
 * Non-static = unique per object, each instance has its own
 * Exercise
 *
 * Decide whether the following should be static or non-static:
 *
 * The total number of students currently enrolled at Hogwarts - static
 * A wizard's name - non-static
 * A spell counter that tracks the total spells cast by all wizards combined - static
 * A spell counter that tracks each individual wizard's spells - non-static
 * A method that calculates an individual wizard's power level based on their experience - non-static
 * A method that prints the Hogwarts school motto (same for everyone) - static
 * The Sorting Hat's list of all four houses - non-static
 * The temperature at which a specific potion is currently brewing - static
 * The name of the current headmaster of Hogwarts - static
 * The specific spell a wizard is currently casting - non-static
 */