package com.pluralsight.week7.Portfolio;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(double weight, double marketValue) {
        super("Gold", marketValue);
        this.weight = weight;
    }
}