package com.pluralsight.GenericMiniExercises;
public class StoreOnce<T> {
    private T value;
    public void put(T value) {
        if (this.value == null) {
            this.value = value;
        }
    }
    public T get() {
        return value;
    }
}
