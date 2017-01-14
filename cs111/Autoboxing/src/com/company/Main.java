package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*JAVA SUPPORTS PRIMITIVE TYPES USING AN OBJECT WRAPPER WITH A CLASS */


        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i = 0; i<10; i++){
            intArrayList.add(Integer.valueOf(i)); //AUTO BOXING
        }

        for(int i =0; i<10; i++){

//            System.out.println(i + " ----> "+intArrayList.get(i).intValue()); //UNBOXING

        }

        Integer myIntValue = 56;


        ArrayList<Double> myDblArray = new ArrayList<Double>();

        for(double dbl = 0.0; dbl<=10.0; dbl+=0.50){
            myDblArray.add(Double.valueOf(dbl)); //BOXING TO WRAPPER
        }

        for(int i =0; i<myDblArray.size(); i++){
            double value = myDblArray.get(i).doubleValue(); //UNBOXING BACK TO DOUBLE
            System.out.println(i+" - "+value);
        }





















    }
}
