package com.pluralsight.GenericMiniExercises;
public class Wrapper<T> {
    private T value;
    public Wrapper(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public boolean equalsByValue(Wrapper<T> other) {
        return this.value.equals(other.getValue());
    }
}
