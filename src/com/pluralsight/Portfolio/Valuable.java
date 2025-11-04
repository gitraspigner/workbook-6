package com.pluralsight.Portfolio;

/**
 * A Valuable is any item that has value. In this case, the value of the item
 * is represented as a decimal number in dollars. (Items can be a valuable,
 * but we won't want to create a generic Valuable since we want to know what
 * the Valuable is and its properties, which is why Valuable is an interface.)
 *
 * @author Ravi Spigner
 */
public interface Valuable {
    double getValue();
}
