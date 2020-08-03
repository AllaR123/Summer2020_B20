package day32_Method_Overlodaing;

import java.util.Scanner;

public class formatFullName {

    public static void main(String[] args) {

        /*
        write a method that can return the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
         */

        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String last = scan.nextLine();

        String s = fullName("Alla", "Rudenko");
        System.out.println(s);

    }

    public static String fullName(String first, String last) {

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();

        last =  last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + last;

        return fullName;
    }
}
