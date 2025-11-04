package com.pluralsight.Portfolio;
/**
 * Gold is a Fixed Asset. Every Gold item is named as "Gold" and contains its weight which
 * determines its value.
 *
 * @author Ravi Spigner
 */
public class Gold extends FixedAsset{
    private double weight;
    public Gold(double weight) {
        super("Gold", weight * 500);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public double getValue() {
        return getMarketValue();
    }
}
