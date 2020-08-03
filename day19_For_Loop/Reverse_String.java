package day19_For_Loop;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string:");
        String name = scan.nextLine();
        String result = "";

        for(int i = name.length()-1; i >= 0; i--) {
            result +=  name.charAt(i);
        }
        System.out.println(result + "");

    }
}
