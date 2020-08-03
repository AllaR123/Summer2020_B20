package day13_Scanner;

import java.util.Scanner;

public class Scanner_next {
    public static void main(String[] args) {


        // next --> for entering one word
        // nextLine --> for entering sentence

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();     //  Alla

        System.out.println("Enter your gender: ");
        String gender = scan.nextLine();

        System.out.println(firstName + gender);


    }
}
