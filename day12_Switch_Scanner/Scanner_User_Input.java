package day12_Switch_Scanner;

import java.util.Scanner;

public class Scanner_User_Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");

        int a = scanner.nextInt();
        String str = (a%2==0) ? + a + " is even numbers" : a + " is odd number";
        System.out.println(str);
    }
}
