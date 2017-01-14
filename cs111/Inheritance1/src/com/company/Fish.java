package com.company;

/**
 * Created by collinboback on 12/31/16.
 */
public class Fish extends Animal{

    private int fins;
    private int gills;
    private int scales;
    private String texture;

    Fish(String name, int size, int weight, int fins, int gills, int scales, String texture){
        super(name, 1, 1, size, weight);
        this.fins = fins;
        this.gills = gills;
        this.scales = scales;
        this.texture = texture;
    }

    public void swim(){

        System.out.println("Fish.swim() called");

    }

}
