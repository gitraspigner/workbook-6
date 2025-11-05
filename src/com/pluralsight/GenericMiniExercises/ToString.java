package com.pluralsight.GenericMiniExercises;
public class ToString implements Mapper<Double,String>{
    @Override
    public String map(Double input) {
        return "" + input;
    }
}
