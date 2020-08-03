package day29_Custome_Method;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a birth year and current year:");
        age(scan.nextInt(), scan.nextInt());
    }

    public static void age(int birthYear, int currentYear) {

        if(currentYear < birthYear) {
            System.out.println("Invalid Entry");
        } else {
            int age = currentYear - birthYear;
            System.out.println(age);
        }
    }
}
