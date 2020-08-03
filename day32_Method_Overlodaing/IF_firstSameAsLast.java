package day32_Method_Overlodaing;

import java.util.Arrays;

public class IF_firstSameAsLast {

    // if first element of the array is greater then last one, assing all elements as value of first, if last one is greater assing all element as last value
    public static void main(String[] args) {

        int[] arr = {10, 3, 9, 1};
        if (arr[0] > arr[arr.length - 1]) {
            for(int a = 0; a <= arr.length - 1; a++){
                arr[a] = arr[0];
            }
        } else if (arr[arr.length - 1] > arr[0]) {
            for(int a = 0; a <= arr.length - 1; a++){
                arr[a] = arr[arr.length -1];
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    /*
    int[] arr = {4, 3, 9, 7};
        if (arr[0] > arr[arr.length - 1]) {
            for (int each : arr) {
                each = arr[0];
                for(int a = 0; a <= arr.length - 1; a++){
                    arr[a] = each;
                }
            }
        } else if (arr[arr.length - 1] > arr[0]) {
            for (int each : arr) {
                each = arr[arr.length-1];
                for(int a = 0; a <= arr.length - 1; a++){
                    arr[a] = each;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
​
    }
     */
}