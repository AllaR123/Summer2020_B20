package day15_String;

import java.util.Scanner;

public class String_length {
    public static void main(String[] args) {

        /*
        String name = "Rudenko Alla";
        int l = name.length();

        // last index: length of String - 1
        int lastIndexNumber = name.length() - 1;

        System.out.println( lastIndexNumber );

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        */


        // Write a program that can print first and last character from your sentence


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = scan.nextLine();
        int lastIndex = str.length()-1;
        System.out.println(str.charAt(0) + ", " + str.charAt(lastIndex) + ".");



    }
}
