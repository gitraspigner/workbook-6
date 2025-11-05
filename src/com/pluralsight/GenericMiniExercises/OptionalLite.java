package com.pluralsight.GenericMiniExercises;
public class OptionalLite<T> {
    private T value;
    private OptionalLite(T value) {
        this.value = value;
    }
    public static <T> OptionalLite<T> of(T v) {
        return new OptionalLite<T>(v);
    }
    public static <T> OptionalLite<T> empty() {
        return new OptionalLite<T>(null);
    }
    public boolean isPresent() {
        return value != null;
    }
    public T get() {
        return value;
    }
}
