package com.pluralsight.week6.blackJack;

public class Card {
    // we need 3 private fields:
    // 1. What suit is it? - Hearts, Spades
    // 2. What value is it? A, 2, K
    // 3. Is it face up

    private String suit;
    private String value;
    private boolean isFaceUp;


    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }


    public String getSuit() {
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }

    }

    public String getValue() {
        if (isFaceUp){
            return value;
        } else {
            return "#";
        }
    }


    public boolean isFaceUp() {
        return isFaceUp;
    }


    // methods-
    public void flip(){
        isFaceUp = !isFaceUp();
    }

    public  int getPointValue(){ // int or string
        if (isFaceUp){
            if(value.equals("A")){
                return 11;
            } else if (value.equals("K") || value.equals("Q") || value.equals("J")) {
                return 10;
            } else {
                return Integer.parseInt(value);
            }
        } else{
            return 0;
        }
    }

}
