package com.company;

/**
 * Created by collinboback on 12/31/16.
 */
public class Horse extends Animal {

    private int hooves;
    private int mane;

    public Horse(String name, int size, int weight, int hooves, int mane) {
        super(name, 1, 1, size, weight);
        this.hooves = hooves;
        this.mane = mane;
    }
}
