package com.company;

/**
 * Created by collinboback on 12/14/16.
 */
public class Fish extends Animal {


    private int eyes;
    private int fins;
    private boolean isScaly;

    public Fish(int size, int weight, String name, int eyes, int fins, boolean isScaly) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.fins = fins;
        this.isScaly = isScaly;
    }


    private void rest() {
        System.out.println("fish.float() called");
        move(0);
    }

    private void moveMuscles() {
        System.out.println("fish.moveMuscles() called");
    }

    private void moveBackFin() {
        System.out.println("fish.moveBackFin() called");

    }


    public void swim(int speed) {
        System.out.println("fish.Swim() called");
        moveMuscles();
        moveBackFin();
        super.move(speed);


    }


    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }

    public boolean isScaly() {
        return isScaly;
    }
}
