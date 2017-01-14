package com.company;

public class Main {

    public static void main(String[] args) {
	//Primitive types: byte, short, int, long, float, double, char, boolean

        String firstName = "Collin";
        String lastName = "Boback";

        System.out.println(firstName + " " + lastName);

        firstName = firstName + " Mitchell";

        System.out.println(firstName + " " + lastName);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is "+ numberString);

        //Result = 250.5549.95

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        //It doesnt perform a numeric operation since lastString is a String
        // Result = 1050

        if(myInt<0){
            System.out.println("FUck me!");
        }else{
            System.out.println("Oy vey!");
        }





    }
}
