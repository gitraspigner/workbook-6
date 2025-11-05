package com.pluralsight.GenericMiniExercises;
public class BiHolder<A,B> {
    private A aValue;
    private B bValue;
    public BiHolder(A aValue, B bValue) {
        this.aValue = aValue;
        this.bValue = bValue;
    }
    public BiHolder<B,A> swap() {
        return new BiHolder<>(bValue, aValue);
    }
    public A getFirst() {
        return aValue;
    }
    public B getSecond() {
        return bValue;
    }
}
