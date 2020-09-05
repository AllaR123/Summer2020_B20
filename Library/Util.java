package Library;

import java.util.Arrays;

public class Util {

    // import Library.Util;

    public static String removeDup(String str){
        String nonDup = "";

        for( String each : str.split("") ){
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }

        return nonDup;
    }
    // removes the duplicates and returns the value string

    public static String reverseString(String str){
        String result = "";
        for(int i = str.length()-1;  i >=0 ; i--){
            result += str.charAt(i);
        }
        return result;
    }
    // reverse the string and return the value

    public static int frequency(String str, char ch){
        int count = 0;
        for(char each  : str.toCharArray() ){
            if(each == ch){
                count++;
            }
        }

        return count;
    }
    //  finds the frequency of char from string str and returns it as int

    public static String uniques(String str){
        String uniques = "";

        for(char each  : str.toCharArray() ){
            int count =frequency(str, each);  // frequency of every character
            if(count == 1){
                uniques += each;
            }
        }

        return uniques;
    }
    // returns the uniques from the string

    public static int maxNum(int[] arr){
        int max = arr[0];

        for( int each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    // find and returns the max number from int array

    public static Integer maxNum(Integer[] arr){
        Integer max = arr[0];

        for( Integer each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    // find and returns the max number from Integer array

    public static double maxNum(double[] arr){
        double max = arr[0];

        for( double each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    // find and returns the max number from double array

    public static Double maxNum(Double[] arr){
        Double max = arr[0];

        for( Double each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    // find and returns the max number from Double array


    public static int minNum(int[] arr){
        int min= arr[0];

        for( int each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from int array

    public static double minNum(double[] arr){
        double min= arr[0];

        for( double each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from double array

    public static Integer minNum(Integer[] arr){
        Integer min= arr[0];

        for( Integer each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from double array

    public static Double minNum(Double[] arr){
        Double min= arr[0];

        for( Double each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for(Integer each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }

    public static String frequencyOfChars(String str){
        // return every single character from the string

        String expectedResult = "";
        String nonDup =    Util.removeDup(str);

        for(char each : nonDup.toCharArray() ){
            int count1 = Util.frequency(str, each);
            expectedResult +=   ""+ each + count1;
        }

        return expectedResult;
    }

    public static String fullName(String first, String last) {
        // print first and last name

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();

        last =  last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + last;

        return fullName;
    }

    public static int[] addElement(int[] arr, int num){
    // inserts the element to the array

        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1] = num;

        int i =0;
        for(int each: arr){
            arr2[i]  = each;
            i++;
        }

        return arr2;
    }

    public static int[] sortDesc(int[] arr) {
        // sort arrays int of descending order

        Arrays.sort(arr);

        int[] desc = new int[arr.length];

        int k =arr.length-1;
        for(int i =0; i <= desc.length-1; i++ ){
            desc[i] =  arr[k];
            k--;
        }
        return desc;
    }

    public static Integer[]  sortDesc(Integer[] arr){
        Arrays.sort(arr);

        Integer[] arr2 = new Integer[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    //sorts Integer array in descending order

    public static Double[]  sortDesc(Double[] arr){
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    //sorts Double array in descending order

    public static Character[]  sortDesc(Character[] arr){
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }

    public static double[] sortDesc(double[] arr) {
        // sort arrays double of descending order

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
        // sort arrays char of descending order

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
        // sort arrays String of descending order

        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }

    public static int[] uniqueElements(int[] arr) {
        // find unique element from int array

        for(int element : arr) {
            int  count = 0;
            for(int each : arr) {
                if(element == each) {
                    count++;
                }
            }

            if(count == 1) {
                System.out.print(element + " ");
            }
        }
        System.out.println();


        return arr;
    }


    public static double[] uniqueElements(double[] arr) {
        // find unique element from double array

        for(double element : arr) {
            int  count = 0;
            for(double each : arr) {
                if(element == each) {
                    count++;
                }
            }

            if(count == 1) {
                // System.out.print(element + " ");
            }
        }

        System.out.println();

        return arr;
    }


    public static String[] uniqueElements(String[] arr) {
        // find unique element from string array

        for(String element : arr) {
            int  count = 0;
            for(String each : arr) {
                if(element == each) {
                    count++;
                }
            }

            if(count == 1) {
                //System.out.println(element + " ");
            }
        }

        System.out.println();

        return arr;
    }

    public static char[] uniqueElements(char[] arr) {
        // // find unique element from char array

        for(char element : arr) {
            int  count = 0;
            for(char each : arr) {
                if(element == each) {
                    count++;
                }
            }

            if(count == 1) {
                //System.out.println(element + " ");
            }
        }

        System.out.println();

        return arr;
    }

    public static void sleep(int seconds) {         // custom method for Thread.sleep

        try {
            Thread.sleep(seconds  * 1000);
        } catch (Exception e) {
        }

    }



}
