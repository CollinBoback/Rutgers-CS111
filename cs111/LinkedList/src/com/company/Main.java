package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        /*Internally, java will allocated 4 bytes of memory to store integers
        Physical memory address -- looks at base address, index +* 4 == address

        Double = 8 bytes. Index 100+(8*index)

        Strings & Objects are a variable size. String Address is 8 bytes and points
        to another address in memory
         */

        Customer customer = new Customer("Collin", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer "+ customer.getName()+ customer.getBalance());

        // customer (1st instance) takes the value of 12.18 because they point to the same
        //location in memory


        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int i = 0; i<intList.size(); i++){
            System.out.println(i+": "+ intList.get(i));
        }

        intList.add(1,6); //index position, storing value 2

        System.out.println("_______________");

        for(int i = 0; i<intList.size(); i++){
            System.out.println(i+": "+ intList.get(i));
        }


    }
}
