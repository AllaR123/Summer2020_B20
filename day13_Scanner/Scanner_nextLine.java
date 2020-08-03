package day13_Scanner;

import java.util.Scanner;

public class Scanner_nextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName =  scan.nextLine();

        System.out.println("Enter your company name: ");
        String company  =  scan.nextLine();

        System.out.println(fullName  + company);

    }
}
