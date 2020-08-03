package day20_While_Loop;

import java.util.Scanner;

public class Div_by_3 {
    public static void main(String[] args) {

        /*
        write a program that can print the numbers between 1 to 100.
                if the number is divisible by 3, do not print it
         */

        for(int i = 0; i <= 100; i++) {
            if(i %3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();


        /*
        write a program that can ask the user enter a number for five times and the returns the sum of those five numbers
         */

        int sum=0;
        for ( int i=1; i<=5; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a number:");
            int num=scan.nextInt();
            sum+=num;
        }
        System.out.println(sum);
        System.out.println();


        /*
        Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop

         */

        int sum2=0;
        for (int i=1; i<5;) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a number:");
            int number=scan.nextInt();
            if(number > 0) {
                sum2+=number;
            } else {
                break;
            }

        }
        System.out.println(sum2);


        /*
        Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();

        int n = 1;
        for(int i  = number; i >= 1; i--) {
            n *= i;
        }
        System.out.println(n);

        }
    }

