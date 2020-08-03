package day33_LocalDateTime;

import java.util.Arrays;

public class Uniques {

    /*
        1. create a method that can print out the unique numbers from an array of integer
        2. create a method that can print out the unique numbers from an array of double
        3. create a method that can print out the unique words from an array of String
        4. create a method that can print out the unique characters from an array of chars
     */

    public static void main(String[] args) {

        int[] r = {1,8,3,3,3,8,10,10};
        r =  uniqueElements(r);
        System.out.println(Arrays.toString(r));
        System.out.println("----------------------------");


        double[] d = {1.6,8.8,3.2,3.2,3.2,8.1};
        d =  uniqueElements(d);
        System.out.println(Arrays.toString(d));
        System.out.println("=============================");


        String[] str = {"level", "top", "love", "happy"};
        str =  uniqueElements(str);
        System.out.println(Arrays.toString(str));
        System.out.println("******************************");


        char[] c = {'v', 'j', 'y', 'y', 'j', 'o'};
        c =  uniqueElements(c);
        System.out.println(Arrays.toString(c));

    }

    public static int[] uniqueElements(int[] arr) {

        for(int element : arr) {
            int  count = 0;
            for(int each : arr) {
                if(element == each) {
                    count++;
                }
            }

            if(count == 1) {
                //System.out.print(element + " ");
            }
        }
        System.out.println();


        return arr;
    }


    public static double[] uniqueElements(double[] arr) {

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
}
