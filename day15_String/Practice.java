package day15_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();

        System.out.println(sentence.charAt(0) + " " + sentence.charAt(sentence.length()-1));

    }
}
