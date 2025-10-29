package com.pluralsight.week6.miniExercisesStatic;
/*
Goal: See how static makes a variable shared across all objects.

Steps:

Create a class Cat with:

A non-static field name
A static field catCount
In the constructor, increment catCount every time a new Cat is created.

Create three cats in your main method.

Print catCount after creating each one.

Reflection: Why does catCount increase even though each Cat has its own name?

 */
public class Cat {
    // Static means "shared by everyone"
    // Non-static - owned by each individual

    String name;
    static int catCount = 0;

    public Cat(String name){
        this.name = name;
        catCount++;
    }

}
