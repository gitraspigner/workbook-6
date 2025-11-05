package com.pluralsight.GenericMiniExercises;
public class BiLabelled<K,V> {
    private String leftLabel;
    private K left;
    private String rightLabel;
    private V right;
    public BiLabelled(String leftLabel, K left, String rightLabel, V right) {
        this.leftLabel = leftLabel;
        this.left = left;
        this.rightLabel = rightLabel;
        this.right = right;
    }
    public String describe() {
        return leftLabel + "="  + left + ", " + rightLabel + "="  + right;
    }
}
