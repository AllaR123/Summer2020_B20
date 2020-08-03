package day33_LocalDateTime;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Arrays;

public class Return_Array {

    /*
        1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order
     */

    public static void main(String[] args) {

        int[] a = {5,7,2,9,6};
        a = sortDesc(a);
        System.out.println(Arrays.toString(a));
        System.out.println("=======================================");

        double[] d = {100.3, 8.9, 45.6, 3.33};
        d = sortDesc(d);
        System.out.println(Arrays.toString(d));

        String[] s = {"Alla", "Denys", "Ruslana", "Mom"};
        s = sortDesc(s);
        System.out.println(Arrays.toString(s));

        char[] c = {'A', 'C', 'W', 'O'};
        c = sortDesc(c);
        System.out.println(Arrays.toString(c));



    }

    public static int[] sortDesc(int[] arr) {

        Arrays.sort(arr);

        int[] desc = new int[arr.length];

        int k =arr.length-1;
        for(int i =0; i <= desc.length-1; i++ ){
            desc[i] =  arr[k];
            k--;
        }
        return desc;
    }

    public static double[] sortDesc(double[] arr) {

        Arrays.sort(arr);

        double[] desc = new double[arr.length];

        int k =arr.length-1;
        for(int i =0; i <= desc.length-1; i++ ){
            desc[i] =  arr[k];
            k--;
        }
        return desc;
    }

    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }


    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }
}
