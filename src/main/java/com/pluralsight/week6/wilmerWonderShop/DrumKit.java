package com.pluralsight.week6.wilmerWonderShop;

public class DrumKit extends MusicItem{
    public DrumKit(String name, double price) {
        super(name, price);
    }
    public String use(){
        return "Boom boom! The drumbeat fills the room!";
    }
}
