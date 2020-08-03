package day24_Array_methods;

import com.sun.xml.internal.ws.api.BindingID;

import java.util.Arrays;
import java.util.Scanner;

public class Combine_2_arrays_max_num {

    public static void main(String[] args) {

        /*
        write a program that can combine two arrays of integers and then print out the maximum number

        arr1 = {1,2,3,4};
        arr2 = {5,6,7,8};

        sum = {1,2,3,4,5,6,7,8}
         */

        Scanner input = new Scanner(System.in);
        int[] arr1 = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int[] arr2 = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];     // 8

        int index = 0;
        for (int each : arr1) {
            arr3[index] = each;
            index++;
        }

        for (int each : arr2) {
            arr3[index] = each;
            index++;

        }
        System.out.println(index);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("Maximum: " + arr3[arr3.length-1]);




        System.out.println("---------------------------------------");

        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean b1 = Arrays.equals(ch1, ch2);
        System.out.println(b1);

    }
}
