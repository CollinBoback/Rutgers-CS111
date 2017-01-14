package com.company;

//A String  variable , fullName, contains a name  in one of two formats:
//last name,  first name  (comma followed by a blank), or
//first name   last name  (single blank)
//
//Extract the first name  into the String  variable  firstName and the last name
//into the String  variable  lastName. Assume  the variables  have been declared
//and fullName already  initialized .
//You may also declare  any other necessary variables .

public class Main {

    public static void main(String[] args) {

        String firstName;
        String lastName;


        String test = IO.readString();

        int indexOfComma = test.indexOf(',');
        int indexOfSpace = test.indexOf(' ');

        if (indexOfComma > 0) {

            lastName = test.substring(0, indexOfComma);
            firstName = test.substring(indexOfComma + 2, test.length());

            System.out.println("Last name is:" + lastName);
            System.out.println("First name is:" + firstName);


        }else{

            firstName = test.substring(0, indexOfSpace);
            lastName = test.substring(indexOfSpace+1, test.length());

            System.out.println("Last name is:"+lastName);
            System.out.println("First name is:"+firstName);
        }


    }
}
