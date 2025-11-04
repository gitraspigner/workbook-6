package com.pluralsight.Portfolio;
/**
 * A House is a Fixed Asset. Every House is named as "House" and contains the year it was
 * built, the number of bedrooms it has, and its square footage.
 * Its square footage is alone is used to determine its value.
 * (Based off of the writeup for this exercise, the amount of time elapsed between when
 * it was built to the current year is not used to determine its value, nor is the number
 * of bedrooms).
 *
 * @author Ravi Spigner
 */
public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;
    public House(int yearBuilt, int squareFeet, int bedrooms) {
        super("House", squareFeet * 1_000);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }
    public int getYearBuilt() {
        return yearBuilt;
    }
    public int getSquareFeet() {
        return squareFeet;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    @Override
    public double getValue() {
        return getMarketValue();
    }
}
