package com.pluralsight.OOPReview.classReview;

public class GameCharacterApp {
    public static void main(String[] args) {
        GameCharacter cr7 = new GameCharacter("CR7", 100, 95);
        GameCharacter messi = new GameCharacter("Messi", 100, 90);

//        cr7.attack(messi);
        System.out.println(cr7.attack(messi));
        System.out.println(cr7.attack(messi));
        System.out.println(cr7.attack(messi));
        System.out.println(cr7.attack(messi));


//        cr7.heal(5);
        System.out.println(cr7.heal(5));

        messi.getStatus();


    }
}
