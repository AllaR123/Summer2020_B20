package day23_Array;

import java.util.Scanner;

public class Sum_Of_2_Nested_For_Loop {

    public static void main(String[] args) {

        /*
        1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
        then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the answer is not a valid answer (not yes or no), the program should repeatedly ask the user re-enter
            HINT: nested loop task, outher loop need to be an infinite loop
         */


        // while loop

        int result = 0;
        String answer = "";

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter two numbers:");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            result = (num1+num2);

            System.out.println("Sum of two numbers equal: "+result);

            scan.nextLine();
            System.out.println("Would you like to repeat? ");
            answer = scan.nextLine();


            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Would you like to repeat? ");
                answer = scan.nextLine();

            };


        } while(answer.equals("yes"));

        System.out.println("Sum of two numbers equal: "+result);

    }
}
