package com.company;

/**
 * Created by collinboback on 1/2/17.
 */
public class Car extends Vehicle {

    // a car IS A vehicle -- inheritance


    private int doors;
    private String engineCapacity;


    public Car(String name, int doors, String engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
