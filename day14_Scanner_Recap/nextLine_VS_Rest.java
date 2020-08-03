package day14_Scanner_Recap;

import java.util.Scanner;

public class nextLine_VS_Rest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age =   input.nextInt(); //19

        input.nextLine(); // Enter

        System.out.println("Enter your full Name");
        String fullName = input.nextLine(); // Cybertek SchoolEnter

        System.out.println("Enter your company Name: ");
        String companyName = input.nextLine();

        System.out.println(fullName+" is "+age+" years old");




    }
}
