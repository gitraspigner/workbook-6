package com.pluralsight.GenericMiniExercises;
@FunctionalInterface //functional interface: an interface with only 1 abstract method
public interface Mapper <I,O> {
    O map(I input);
}
