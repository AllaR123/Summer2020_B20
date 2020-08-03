package day11_Ternary_Nested_if;

import java.util.Scanner;

public class Days_into_Words {

    public static void main(String[] args) {

        /*
        1. write a java program that can convert numbers between 0 ~ 9 to words,
        if the number is greater than 9 or less than zero, out put should be "Invalid".
         */

        Scanner sn = new Scanner(System.in);
        System.out.println(" please enter a number between 0 to 9 to convert it into text");
        int input = sn.nextInt();
        String result = "";

        if ( input == 1) {
            result = "one";
        } else if ( input == 2) {
            result = "two";
        } else if (input == 3) {
            result = "three";
        } else if (input == 4) {
            result = "four";
        } else if ( input == 5) {
            result = "five";
        } else if ( input == 6 ) {
            result = "six ";
        } else if ( input == 7 ){
            result = "seven";
        } else if ( input == 8 ) {
            result = "eight";
        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }

    }

