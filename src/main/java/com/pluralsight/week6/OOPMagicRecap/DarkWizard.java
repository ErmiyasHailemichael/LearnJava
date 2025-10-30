package com.pluralsight.week6.OOPMagicRecap;

public class DarkWizard extends Wizard{

    public DarkWizard(String name, String house, int powerLevel) {
        super(name, house, powerLevel);
    }

    public String castSpell(String spell){
        return "The dark wizard " + getName() + " unleashes " + spell + " - fear the darkness!";
    }
}
