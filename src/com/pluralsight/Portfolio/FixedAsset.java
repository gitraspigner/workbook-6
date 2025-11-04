package com.pluralsight.Portfolio;
/**
 * A Fixed Asset is a type of Valuable that has a value and a name.
 * (Items like Jewelry, Gold, or a House are all Valuables that are examples of fixed assets,
 * but we won't want to create a generic Fixed Asset (just like a Valuable) since we want to
 * know what the Valuable is and its properties, which is why Fixed Asset is an abstract class.)
 *
 * @author Ravi Spigner
 */
public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;
    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }
    public String getName() {
        return name;
    }
    public double getMarketValue() {
        return marketValue;
    }
}
