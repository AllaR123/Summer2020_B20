package day13_Scanner;

import java.util.Scanner;

public class nextLine_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a building number");
        int buildingNum = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter a street name");
        String streetName = scan.nextLine();

        System.out.println("Building numbers is: " + buildingNum + " street address: " + streetName);
        scan.close();

    }
}
