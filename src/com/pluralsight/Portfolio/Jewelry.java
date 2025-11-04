package com.pluralsight.Portfolio;
/**
 * Jewelry is a Fixed Asset. Every Jewelry item has a name for it and contains its Karat which
 * determines its value.
 *
 * @author Ravi Spigner
 */
public class Jewelry extends FixedAsset{
    private double karat;
    public Jewelry(String name, double karat) {
        super(name, karat * 1_000);
        this.karat = karat;
    }
    public double getKarat() {
        return karat;
    }
    @Override
    public double getValue() {
        return getMarketValue();
    }
}
