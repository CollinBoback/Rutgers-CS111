package com.company;

/**
 * Created by collinboback on 12/31/16.
 */
public class Car extends Vehicle{

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}


