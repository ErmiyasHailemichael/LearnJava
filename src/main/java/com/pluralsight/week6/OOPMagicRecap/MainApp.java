package com.pluralsight.week6.OOPMagicRecap;

import java.sql.SQLOutput;

public class MainApp {
    public static void main(String[] args) {

        Wizard harry = new Wizard("Harry", "Gryffindor", 87,"Holly wood with a phoenix feather");
        Wizard ron = new Wizard("Ron","Gryffindor", 75,"12' ash wand with a unicorn tail");
        Wizard hermione = new Wizard("Hermione", "Gryffindor", 90, "vine wood with a dragon heartstring core");

//        harry.castSpell("Expelliarms");
        System.out.println(harry.castSpell("Expelliarms"));
        System.out.println(ron.castSpell("Stupefy"));
        System.out.println(hermione.castSpell("something"));
    }
}
