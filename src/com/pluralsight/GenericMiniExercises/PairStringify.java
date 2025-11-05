package com.pluralsight.GenericMiniExercises;
public class PairStringify<T> {
    public String stringify(T val1, T val2) {
        return val1.toString() + "," + val2.toString();
    }
}
