package day24_Array_methods;

public class Find_Unique_Array {
    public static void main(String[] args) {

        /*
        write a program that can print out the unique numbers from an array of integers
    Ex:
        int[] arr ={1,1,2,3,3,4}
        output:
            2 4
         */

        /*
        int[] arr ={1,1,2,3,3,4};


        for(int j = 0; j <= arr.length-1; j++) {

            int num = arr[j];
            int count = 0;

            for (int i = 0; i <= arr.length - 1; i++) {
                int each = arr[i];
                if (each == num) {
                    count++;
                }
            }

            if(count == 1) {
                System.out.println(num);
            }
        }

         */

        int[] arr ={1,1,2,3,3,4};


        for(int a : arr) {

            int count = 0;

            for (int  b : arr) {
                int each = arr[b];
                if (b == a) {
                    count++;
                }
            }

            if(count == 1) {
                System.out.println(a);
            }
        }


    }
}
