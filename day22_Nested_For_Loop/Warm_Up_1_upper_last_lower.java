package day22_Nested_For_Loop;

import java.util.Scanner;

public class Warm_Up_1_upper_last_lower {
    public static void main(String[] args) {

        /*
        1. Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter then print true,
        otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
         */

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string:");
        String word = scan.next();
        String result = "";
        int lastIndex = word.length()-1;

        boolean abc = word.substring(0,1).equals(word.substring(0,1).toUpperCase());
        boolean last =  word.substring(lastIndex).equals(word.substring(lastIndex).toLowerCase()) ;

            if(abc && last) {
                System.out.println(true);
            } else  {

                System.out.println(false);
            }

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string:");
        String word = scan.next();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);

        boolean start = ch1 >= 'A' && ch1 <= 'Z';
        boolean end = ch2 >= 'a' && ch2 <= 'z';

        if(start && end) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        }


    }

