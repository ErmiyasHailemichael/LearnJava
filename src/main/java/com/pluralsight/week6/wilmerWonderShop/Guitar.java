package com.pluralsight.week6.wilmerWonderShop;

public class Guitar extends MusicItem{
    public Guitar(String name, double price) {
        super(name, price);
    }
    public String use(){
        return "Strumming the strings of the guitar!";
    }
}
