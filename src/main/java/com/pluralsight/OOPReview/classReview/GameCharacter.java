package com.pluralsight.OOPReview.classReview;

public class GameCharacter {
    private String name;
    private int health;
    private int powerLevel;

    public GameCharacter(String name, int health, int powerLevel) {
        this.name = name;
        this.health = health;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    // methods
    public int attack(GameCharacter opponent){
        // reduces opponent’s health by some amount, let's say 5 point
        opponent.health = opponent.health - 5;
        return opponent.health;
    }

    public int heal(int points){
        // adds to health
        health = health + 5;
        return health;
    }

    public void getStatus(){
        System.out.println("current status " + health + " , "+ powerLevel);
    }
}
/*
Exercise 5 — GameCharacter

Attributes: name, health, powerLevel
Methods:

attack(GameCharacter opponent) → reduces opponent’s health by some amount

heal(int points) → adds to health

getStatus() → returns current health and power

🧠 Create two characters and make them fight turn by turn until one wins.

🏫 Exercise 6 — School

Combine multiple objects:

Each School has a name and a list of students (using ArrayList<Student>)

Methods to addStudent(Student s) and showAllStudents()

🧠 This will give you your first taste of aggregation (“has-a” relationship).

💬 Exercise 7 — Return vs Void Practice

Pick any object (Car, BankAccount, Student, etc.)

Make one method that prints info directly (void)

Make another that returns the same info (String)
Compare the difference in how you use them.
 */