package com.company;


public class Car {

    private int doors; // state components
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public void setModel(String model) { //SETTER
        String validModel = model.toLowerCase();

        if(validModel.equals("Carrera") || validModel.equals("911")){
            this.model = validModel;
        }else{
            this.model = "Unknown";
        }

    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public void setEngine(String engine){
        this.engine = engine;
    }

    public void setColor(String color){
        this.color = color;
    }



    public String getModel(){ //GETTER
        return this.model;
    }

    public String getEngine(){
        return  this.engine;
    }

    public String getColor(){
        return this.color;
    }

    public int getDoors(){
        return this.doors;
    }

    public int getWheels(){
        return this.wheels;
    }

    }

