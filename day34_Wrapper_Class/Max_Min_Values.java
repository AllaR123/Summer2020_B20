package day34_Wrapper_Class;

import java.util.Scanner;

public class Max_Min_Values {

    public static void main(String[] args) {


        int a = Integer.MAX_VALUE;
        System.out.println(a);          // 2147483647

        double b = Integer.MIN_VALUE;
        System.out.println(b);          // -2.147483648E9

        System.out.println("_----------------------------------------_");


        // find max value

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;        // -2147483648
        int min = Integer.MAX_VALUE;        // 2147483647

        for(int i = 1; i <= 5; i ++) {
            System.out.println("Enter a number:");
            int n = scan.nextInt();     // 10, 15, 5, 12, 0

            if(n > max) {
                max = n;
            }

            if(n < min) {
                min = n;
            }
        }

        System.out.println("Max num is: " +  max);
        System.out.println("Min num is: " + min);

    }
}
