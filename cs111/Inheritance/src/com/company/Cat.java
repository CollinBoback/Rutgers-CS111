package com.company;

/**
 * Created by collinboback on 12/14/16.
 */
public class Cat extends Animal {


    private int hairballs;
    private String tailType;


    public Cat(int size, int weight, String name, int hairballs, String tailType) {
        super(1, 1, size, weight, name);
        this.hairballs = hairballs;
        this.tailType = tailType;
    }

    private void moveLegs(int speed){
        System.out.println("cat.moveLegs() called");
    }


    public void walk(){
        move(5);
    }

    public void run(){
        move(10);
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("*Eats slowly*");

    }

    @Override
    public void move(int speed) {
        System.out.println("cat.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
