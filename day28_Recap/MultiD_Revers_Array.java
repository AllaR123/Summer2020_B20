package day28_Recap;

import java.util.Arrays;

public class MultiD_Revers_Array {

    public static void main(String[] args) {

        /*
        9 10 11 12 13
        4 5 6 7 8
        1 2 3
         */

        int arr2D[][] = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arr2D.length - 1; i>= 0; i--) { // iterates each 1D array from arr2D
            int[] arr1D = arr2D[i];
            //System.out.println( Arrays.toString(each1DArray)  );
                for(int each : arr1D) {
            }

        }

        System.out.println("==============================================");

        /*
        3 2 1
        8 7 6 5 4
        13 12 11 10 9
         */

        for (int i = 0; i <= arr2D.length - 1; i++) {
            int[] arr1D = arr2D[i];
            System.out.println(Arrays.toString(arr1D));

            for(int j = arr1D.length-1; i < 0; i--) {
                System.out.print(arr1D[j] + " ");
            }
            System.out.println();
        }
    }
}