package day30_Custome_Met_Practice;

import java.util.Arrays;

public class ReturnMethod3 {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(max(a));

    }

    public static int max(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }

    public static int max2(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
}
