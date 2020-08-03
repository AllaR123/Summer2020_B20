package day23_Array;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String[] days = new String[7];
        days[6] = "Sunday";
        days[1] = "Tuesday";
        days[4] = "Friday";
        days[3] = "Thursday";
        days[2] = "Wednesday";
        days[5] = "Saturday";
        days[0] =  "Monday";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 ~ 7:");
        int n = scanner.nextInt();

        for(int i = 0; i <= days.length-1; i++) {

        }
            System.out.print(days[n-1] + " ");

    }
}
