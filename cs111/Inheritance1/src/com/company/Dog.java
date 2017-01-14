package com.company;

/**
 * Created by collinboback on 12/31/16.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        super.eat();
        chew();
        System.out.println("Dog.eat() called");
    }


    public void chew(){
        System.out.println("Dog.chew() called");
    }

    public void walk(){
        super.move(5);
        System.out.println("Dog.walk() called");


    }

    public void run(){
        move(10);
        System.out.println("Dog.run() called");

    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
