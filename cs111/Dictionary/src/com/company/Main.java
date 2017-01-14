package com.company;

//Assume  that s is a String  . Write an expression  whose value
// is true  if and only if the value  of s would come between
// "mortgage" and "mortuary" in the dictionary.


//he Java String class provides the .compareTo () method in order to lexicographically compare Strings.
// It is used like this "apple".compareTo ("banana").

//The return of this method is an int which can be interpreted as follows:

//returns < 0 then the String calling the method is lexicographically first (comes first in a dictionary)
//returns == 0 then the two strings are lexicographically equivalent
//returns > 0 then the parameter passed to the compareTo method is lexicographically first.

public class Main {

    public static void main(String[] args) {

//        String name1 = IO.readString();
//        String name2 = IO.readString();
//        String name3 = IO.readString();
//        String max;
//
//        if (name1.compareTo(name2) > 0) {
//            if (name1.compareTo(name3) > 0) {
//                max = name1;
//
//            } else {
//                max = name3;
//            }
//        } else {
//            if (name2.compareTo(name3) > 0) {
//                max = name2;
//            } else {
//                max = name3;
//            }
//        }
//
//        System.out.println(max);

        System.out.println(min("zack", "zack","zack"));


    }

    public static String min(String string1, String string2, String string3) {


        String smallest = "hello";


        if (string1.compareTo(string2) <= 0) {
            if (string1.compareTo(string3) =< 0) {
                smallest = string1;
            } else {
                smallest = string3;
            }


        } else if (string2.compareTo(string1) < 0) {
            if (string2.compareTo(string3) < 0) {
                smallest = string2;
            } else {
                smallest = string3;
            }
        }

        return smallest;
    }


}

