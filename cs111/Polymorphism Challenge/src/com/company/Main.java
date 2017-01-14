package com.company;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public void StartEngine() {
        System.out.println("Generic Car engine on");
    }

    public void accelerate() {
        System.out.println("Generic car is accelerating");
    }

    public void brake() {
        System.out.println("Generic Car is braking");
    }

    public String getName() {
        System.out.println("Name is " + name);
        return name;
    }


    public int getCylinders() {
        return cylinders;
    }


}

class Porsche extends Car {

    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void StartEngine() {
        System.out.println("Porsche engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Porsche is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Porsche is braking");
    }
}

class Mercedes extends Car {
    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void StartEngine() {
        System.out.println("Mercedes engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedes is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes is braking");
    }
}

class RangeRover extends Car {

    public RangeRover(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void StartEngine() {
        System.out.println("Range Rover engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Range Rover is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Range Rover is braking");
    }
}




public class Main {

    public static void main(String[] args) {

        Porsche porsche = new Porsche("Porsche", 4);


        porsche.accelerate();


    }
}
