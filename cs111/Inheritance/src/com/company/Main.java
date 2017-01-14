package com.company;

public class Main {

    /*
    Computers (iMac, iPhone, Android)
        Share common characteristics (RAM, state, etc)
        Have different features
            iMac runs on OSX has USB

        OOP allows us to create classes to inherit state and behavior from other classes

    */

    public static void main(String[] args) {

        Dog dog = new Dog(10, 100, "Schnoodle", 2, 4, 1, 10, "Curly");
        Cat cat = new Cat(1, 1, "Tiger", 1, "Long");
        Fish fish = new Fish(2, 3, "Clown Fish", 2, 4, true);


        fish.swim(5);




    }


}

