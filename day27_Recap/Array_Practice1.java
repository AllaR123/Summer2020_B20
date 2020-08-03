package day27_Recap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {

        String[] names = {"Alla", "Denys", "Rumiya", "Katya"};

        System.out.println(names[1]);
        System.out.println("==============================================");

        for (String each : names) {
            if(each.startsWith("A")) {
                continue;
            } else {
                System.out.println(each);
            }
        }


        System.out.println("------------------------------------------------");


        int[] number = new int[4];
        System.out.println(number);                         // [I@61bbe9ba
        System.out.println(Arrays.toString(number));        // [0, 0, 0, 0, 0]

        number[3] = 25;
        number[0] = 100;
        number[3] = 300;

        System.out.println(Arrays.toString(number));


        System.out.println("*********************************************");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter");

        String[] students = new String[ scan.nextInt() ]; //3Enter

        scan.nextLine(); // take out the Enter in scanner
        for(int i = students.length-1 ; i >= 0; i--){ //i: 0,1,2,3...students.length-1
            System.out.println("Enter a name");
            students[i]  = scan.nextLine();
        }


        System.out.println(Arrays.toString(students));




    }
}
