package com.pluralsight.week6.wilmerWonderShop;

public class Wand extends MagicItem{
    public Wand(String name, double price) {
        super(name, price);
    }
    public String use(){
        return "Swish! The wand sparks with magical energy!";
    }
}
