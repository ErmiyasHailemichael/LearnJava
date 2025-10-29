package com.pluralsight.week6.OOPMagicRecap;

public class MainApp {
    public static void main(String[] args) {

        Wizard harry = new Wizard("Harry", "Gryffindor", 87,"Holly wood with a phoenix feather");
        Wizard ron = new Wizard("Ron","Gryffindor", 75,"12' ash wand with a unicorn tail");
        Wizard hermione = new Wizard("Hermione", "Gryffindor", 90, "vine wood with a dragon heartstring core");


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

        harry.setWand(harryWand);

        Wand hermioneWand = new Wand();
        hermioneWand.setWood("Vine wood");
        hermioneWand.setCore("dragon heartstring");
        hermioneWand.setLength(34);

        hermione.setWand(hermioneWand);
        System.out.println(hermione.getName() + " " + hermione.getWand().getWood() + " "+ hermione.getWand().getCore());
    }
}
