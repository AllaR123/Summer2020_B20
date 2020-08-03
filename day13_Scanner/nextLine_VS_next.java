package day13_Scanner;

import java.util.Scanner;

public class nextLine_VS_next {
    public static void main(String[] args) {

        // nextLine --> does not work with methods like nextInt, nextDouble, nextByte, nextShort ...
        // nextLine does not work with other methods of the scanner

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = scan.nextInt();        // 120000

        scan.nextLine();            // Enter. We are not going to reuse, so no need to assign to variable

        System.out.println("Enter your full name");
        String fullName =  scan.nextLine();

        System.out.println("Your salary is: " + salary + " your fullName is: " + fullName);
    }
}
