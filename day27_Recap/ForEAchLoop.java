package day27_Recap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEAchLoop {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for (int each : arr) {
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println("==============================");

        int[] array = {1,2,3,4,5};

        for (int i = array.length; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("==============================");

        int[] score = {10,20,30,40,50,60,70,80,90,100,110};

        for (int each : score) {
            if(each % 3 != 0) {
                continue;
            }

            System.out.print(each + "  ");

        }

        System.out.println();
        String[] names = {"AB", "BC", "CD", "DE"};

        for(String each : names) {
            if(!each.contains("C")) {
                continue;
            }
            System.out.print(each + "  ");

        }

        System.out.println();
        System.out.println("------------------------------------------");

        int[] arrr = {1,2,3,4,5};

        int max = arrr[0];
        int min = arrr[0];

        for (int i = 0; i < arrr.length; i++) {
            if(max < arrr[i]) {
                max = arrr[i];
            } else if (min > arrr[0]) {
                min = arrr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);


    }
}
