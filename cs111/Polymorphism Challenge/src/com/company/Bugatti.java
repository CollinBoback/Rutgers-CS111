package com.company;

class Bugatti extends Car {

    public Bugatti(String name, int cylinders) {
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




