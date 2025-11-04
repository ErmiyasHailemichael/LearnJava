package com.pluralsight.week7.Portfolio;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;

    public House(String address, int yearBuilt, int squareFeet, double marketValue) {
        super(address, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
    }
}