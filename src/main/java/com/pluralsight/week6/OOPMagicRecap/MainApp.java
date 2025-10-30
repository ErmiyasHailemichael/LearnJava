package com.pluralsight.week6.OOPMagicRecap;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Wizard> wizards = new ArrayList<Wizard>();


        Wizard harry = new Wizard("Harry", "Gryffindor", 87, "Holly wood with a phoenix feather");
        Wizard ron = new Wizard("Ron", "Gryffindor", 75, "12' ash wand with a unicorn tail");
        Wizard hermione = new Wizard("Hermione", "Gryffindor", 90, "vine wood with a dragon heartstring core");

        // using constructors
        Wizard messi = new Wizard("Messi","Barca",96);
        Professor wenger = new Professor("Wenger", "Arsenal", 96,"Coach");
        // Q8 -
        Professor professor1 = new Professor("Ermi","Gryffindor", 77,"Holly","Transfiguration");

        Professor mcgonagall = new Professor("McGonagall", "Gryffindor", 95, "Fir wood", "Transfiguration");
        System.out.println("Professor and subject test code : " + professor1.getName() + " " + professor1.getSubject());

        System.out.println("\n=== Professors Teaching ===");
        System.out.println(mcgonagall.teachSpell("Expelliarmus"));
        System.out.println(professor1.teachSpell("Biology"));


//        harry.castSpell("Expelliarms");
        System.out.println(harry.castSpell("Expelliarms"));
        System.out.println(ron.castSpell("Stupefy"));
        System.out.println(hermione.castSpell("something"));

        System.out.println("\n Q-4 ^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Wizard.welcomeMessage();


        // Q6- composition
        Wand harryWand = new Wand();
        harryWand.setWood("Holy");
        harryWand.setCore("Phoenix feather");
        harryWand.setLength(11);

        Wand ronWand = new Wand();
        ronWand.setWood("Ash");
        ronWand.setCore("Unicorn tail");
        ronWand.setLength(12);
        ron.setWand(ronWand);
        harry.setWand(harryWand);

        Wand hermioneWand = new Wand();
        hermioneWand.setWood("Vine wood");
        hermioneWand.setCore("dragon heartstrings core");
        hermioneWand.setLength(34);

        hermione.setWand(hermioneWand);
        System.out.println(hermione.getName() + " " + hermione.getWand().getWood() + " " + hermione.getWand().getCore());
        System.out.println(ron.getName() + "'s wand is made of " + ron.getWand().getWood() + " with a " + ron.getWand().getCore() + " core");

        // 7 - looping over classes
        /*
        Create an ArrayList of Wizard objects, each with their own Wand.
         Loop over the list and print each wizard's name along with their wand's wood type, core, and length.
         Format it nicely, like: "Hermione's wand: Vine wood, Dragon heartstring core, 10.75 inches"

         */
        wizards.add(harry);
        wizards.add(ron);
        wizards.add(hermione);
        System.out.println("\n=== Wizard Wands ===");
        for (Wizard w : wizards) {
            System.out.println(w.getName() + "'s wand: " +
                    w.getWand().getWood() + ", " +
                    w.getWand().getCore() + " core, " +
                    w.getWand().getLength() + " inches");
        }
    }
}
