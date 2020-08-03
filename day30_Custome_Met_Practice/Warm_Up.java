package day30_Custome_Met_Practice;

import java.util.Arrays;

public class Warm_Up {

    /*
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop

     */

    public static void main(String[] args) {

        maxNum(8,3);
        int[] nums = {10, 11, 8, 9, 12, 5, 15};


        arrDescending(nums);
        System.out.println();


        int[] arr = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] arr4 = combination(arr, arr2);       // this one  is return type
        System.out.println(Arrays.toString(arr4));



        int[] num3 = {1,2,3,4,5};
        diff(-100);

        for(int each : num3) {
            diff(each);
        }


    }

    // 1
    public static void maxNum(int num1, int num2) {

        if(num1 > num2) {
            System.out.println(num1 + " is maximum number");
        } else {
            System.out.println(num2 + " is maximum number");
        }

    }

    // 2
    public static void arrDescending(int[] arr) {

        Arrays.sort(arr);
        for(int  i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    // 3
    public static int[] combination(int[] arr, int[] arr2) {

        int[] array1and2 = new int[arr.length + arr2.length];

        int index = 0;
        for(int each : arr) {
           array1and2[index] = each;
           index++;
        }

        for(int each : arr2) {
            array1and2[index] = each;
            index++;
        }
        return array1and2;

        /*
        int index = 0;
        int index2 = 0;
        for(int i = 0; i < array1and2.length; i++) {
            if(index<arr.length) {
                array1and2[i] = arr[index];
                index++;
            }else if(index2< arr.length) {
                array1and2[i] = arr2[index2];
                index2++;
            }
        }
        System.out.println(Arrays.toString(array1and2));
         */

    }

    public static void diff(int num3) {

        if(num3 > 0) {
            System.out.println(num3 + " is positive");
        } else if(num3 < 0) {
            System.out.println(num3 + " is negative");
        } else {
            System.out.println(num3 + " is zero");
        }
        System.out.println(num3);

    }
}
