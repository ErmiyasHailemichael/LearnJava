package com.plurasight.week5.inheritance.AbstractAssets;

public class Cash extends Asset2{

    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public double getValue() {
        return getOriginalCost();
    }
}
