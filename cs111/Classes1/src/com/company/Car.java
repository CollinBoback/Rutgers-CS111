package com.company;

/**
 * Created by collinboback on 12/13/16.
 */
public class Car {


    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public Car() {
        this("Default Model", "Default engine", "Default Color", 0, 0);
        System.out.println("Empty constructor called");
    }

    public Car(String model, String engine, String color, int wheels, int doors) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.wheels = wheels;
        this.doors = doors;
    }


    public Car(int doors, String model, String color) {
        this(model, "Default engine", color, 4, doors);
        this.doors = doors;
        this.model = model;
        this.color = color;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();

        if (validModel.equals("escape") || validModel.equals("mustang")) {
            this.model = model;
        } else {
            this.model = "unknown";
            System.out.println("Not a valid model!");
        }

    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getModel() {
        return this.model;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getColor() {
        return this.color;
    }

    public int getWheels() {
        return this.wheels;
    }

    public int getDoors() {
        return this.doors;
    }
}



