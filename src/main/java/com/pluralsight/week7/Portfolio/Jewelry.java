package com.pluralsight.week7.Portfolio;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double karat, double marketValue) {
        super(name, marketValue);
        this.karat = karat;
    }
}