package day21_Do_While_Loop;

import java.util.Scanner;

public class Deving_without_operators {

    public static void main(String[] args) {

        /*
        write a program that can divide two numbers without using / & % operators and returns the devision and remainder
            ex:
                input:  10      10 - 3 = 7; 7 - 3 = 4; 4 - 3 = 1
                        3
                0utput: 3 with a remainder of 1
         */

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();      // 10
        int num2 = scan.nextInt();      // 3

        int a = 20; //2
        int b = 3;

        if(b == 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }


        int count = 0; //3

        while(a >= b){
            a -= b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);
    }
}