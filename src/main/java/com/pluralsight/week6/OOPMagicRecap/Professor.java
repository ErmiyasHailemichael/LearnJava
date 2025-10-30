package com.pluralsight.week6.OOPMagicRecap;

public class Professor extends Wizard{
    private String subject;

    public Professor(String name, String house, int powerLevel, String subject) {
        super(name, house, powerLevel);
        this.subject = subject;
    }

    public Professor(String name, String house, int powerLevel, String wandType, String subject) {
        super(name, house, powerLevel, wandType);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public  String teachSpell(String spell){
        return "Professor " + getName() + " teaches you " + spell + " in " + subject + " class.";// struggling to get name and subject
    }
}
