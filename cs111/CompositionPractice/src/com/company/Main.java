package com.company;

public class Main {

    public static void main(String[] args) {

        Walls wall1 = new Walls("north");
        Walls wall2 = new Walls("south");
        Walls wall3 = new Walls("east");
        Walls wall4 = new Walls("west");
        Ceiling ceiling = new Ceiling(10, 10);
        Bed bed = new Bed("Cot",2, 10,2,4);
        Lamp lamp = new Lamp("Desk", false, 100);
        Room myRoom = new Room("Col's Room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        myRoom.makeBed(); //Directly calling
        myRoom.getLamp().turnOn(); //Calling using getter





    }
}
