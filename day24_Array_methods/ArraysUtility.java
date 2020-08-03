package day24_Array_methods;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));

        String s1 =  Arrays.toString(arr);
        System.out.println(s1);


        System.out.println("--------------------------------");



        // Arrays.toString()

        String[] arr2 = {"Alla", "Denys", "Rumiya", "Adam", "Cristina"};
        System.out.println(Arrays.toString(arr2));



        // Arrays.sort()
        // Finding max and min numbers from array

        int[] arr3 = {10,4,8,1,66,2};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("Maximum number: " + arr3[arr3.length-1]);       // last index of array
        System.out.println("Minimum number: " + arr3[0]);                   // first index of array



        // Arrays.equals()

        int[] arr4 = {10,4,8,1,66,2};
        int[] arr5 = {10,4,8,1,66,2};

        System.out.println(Arrays.equals(arr4, arr5));      // true

        System.out.println("======================================");

        // split(value) --> return String Array

        String sentence = "I Love Programming Language";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");       // Language Programming Love I
        }

        // toCharArray()


        String str = "ABCDEFGHIJ";
        char[] ch = str.toCharArray();

        System.out.println( Arrays.toString(ch ) );

        System.out.println("===========================");
        String str1 = "DCEBAF";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray(); // [D, C, E, B, A]
        char[] ch2 = str2.toCharArray(); // [A, D, C, B, E]

        Arrays.sort(ch1); //[A, B, C, D, E]
        Arrays.sort(ch2); //[A, B, C, D, E]

        boolean r1 = Arrays.equals(ch1, ch2);
        System.out.println(r1);
    }
}
