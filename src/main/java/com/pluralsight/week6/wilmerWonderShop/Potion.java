package com.pluralsight.week6.wilmerWonderShop;

public class Potion extends MagicItem{
    public Potion(String name, double price) {
        super(name, price);
    }
    public String use(){
        return "You drink the potion. You feel invisible!";
    }
}
