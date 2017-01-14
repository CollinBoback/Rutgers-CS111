package com.company;


//Given an array of ints of odd length, look at the first, last,
// and middle values in the array and return the largest.
// The array length will be a least 1.
//        maxTriple([1, 2, 3]) → 3
//        maxTriple([1, 5, 3]) → 5
//        maxTriple([5, 2, 3]) → 5


public class Main {

    public static void main(String[] args) {

        int[] myArray = {2, 5};
        int[] mySecondArray = {4, 5};

        System.out.println(make2(myArray, mySecondArray)[0]);
        System.out.println(make2(myArray, mySecondArray)[1]);


    }

    public static int[] middle3(int[] nums) {

        int[] myArray = {nums[(nums.length / 2) - 1], nums[(nums.length / 2)], nums[(nums.length / 2) + 1]};

        return myArray;


    }

    public static int maxTriple(int[] nums) {

        int maxValue = 0;

        if (nums[0] > nums[nums.length / 2]) {
            if (nums[0] > nums[nums.length - 1]) {
                maxValue = nums[0];
            } else {
                maxValue = nums[nums.length - 1];
            }
        }

        if (nums[0] < nums[nums.length / 2]) {
            if (nums[nums.length / 2] > nums[nums.length - 1]) {
                maxValue = nums[nums.length / 2];
            } else {
                maxValue = nums[nums.length - 1];
            }
        }

        return maxValue;
    }

//    Given 2 int arrays, a and b, return a new array
// length 2 containing, as much as will fit, the elements
// from a followed by the elements from b. The arrays may be any length,
// including 0, but there will be 2 or more elements available between the 2 arrays.
//
//    make2([4, 5], [1, 2, 3]) → [4, 5]
//    make2([4], [1, 2, 3]) → [4, 1]
//    make2([], [1, 2]) → [1, 2]

    public static int[] make2(int[] a, int[] b) {

        int[] myArray = new int[2];

        if (a.length == 2) {
            myArray[0] = a[0];
            myArray[1] = a[1];

        }else if(a.length==1){
            myArray[0]=a[0];
            myArray[1]=b[0];
        }else if(a.length==0){
            myArray[0]=b[0];
            myArray[1]=b[1];
        }


        return myArray;
    }
}
