package day21_Do_While_Loop;

import java.util.Scanner;

public class Max_and_Min_number {
    public static void main(String[] args) {

        /*
    1. write a program that asks user to enter 5 numbers and returns the maximum number
    2. write a program that asks user to enter 5 numbers and returns the minimum number
         */

        // maximum


        Scanner scan = new Scanner(System.in);

        int max = -293837654;
        int min = 999999999;

        for(int i = 1; i <= 5; i++) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();

            if(number > max) {
                max = number;

            } if(number < min) {
                min = number;
            }

        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum numbers is: " + min);

    }
}
