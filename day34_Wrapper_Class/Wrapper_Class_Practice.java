package day34_Wrapper_Class;

import java.util.Arrays;

public class Wrapper_Class_Practice {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        Integer[] arr2 = {1,2,3,4};
        for(Integer each : arr2) {
            System.out.println(each);
        }

        /*
        for(int each : arr2) {
            System.out.println(each);              same thing, either it's Integer OR int
        }
         */

        double[] arr3 = {1,2,3,4,5,6,7,8,9};
       // Double[] arr4 = {1,2,3,4,5,6,7,8,9};  // in wrapper class MUST give decimals numbers

        char[] arr4 = {65,67,68,64};
        System.out.println(Arrays.toString(arr4));      // [A, C, D, @]

        char ch = 72;
        Character ch2 = 72;

        System.out.println(ch2);    // H

        System.out.println("======================================");

        String[] nums1 = {"1.2","13","14","15.2"};
        double[] nums2 = new double[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
           nums2[i] =  Double.parseDouble(nums1[i]); // we can use valueOf as well

        }
        System.out.println(Arrays.toString(nums2));         // [1.2, 13.0, 14.0, 15.2]
    }
}
