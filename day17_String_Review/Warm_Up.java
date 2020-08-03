package day17_String_Review;

import java.util.*;

public class Warm_Up {
    public static void main(String[] args) {

        /*
        1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
         */

        /*
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scan.next();
        if(word.startsWith("x")) {
            System.out.println(word.substring(1));
        } else {
            System.out.println(word);
        }

         */




        /*
        2. Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s).
        If x is the third letter it should be printed. If the first and second are x, both should be ignored.
                    Input:
                        xxode
                    Output:
                        ode
                    Input:
                        oxidex
                    Output:
                        oidex
         */

        /*

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scan.next();

        if (word.substring(0, 1).contains("x")) {
            System.out.println(word.substring(1));
        } else if (word.substring(0, 2).contains("x")) {
            System.out.println(word.substring(2));
        } else if (word.substring(0,1).contains("x") && word.substring(1,2).contains("x")) {
            System.out.println(word.substring(2));
        } else {
            System.out.println(word);
       }

         */





        /*
        3. Ask user to enter two words. Then add them together and print.
        But if the last letter in the first word and the first letter of the second word is the same,
        print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

         */

        /*

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String str1 = scan.next();
        System.out.println("Enter second word");
        String str2 = scan.next();
        String result = "";

        if(str1.charAt(str1.length()-1) == str2.charAt(0)) {
            result += str1 + str2.substring(1);
        } else {
            result += str1 + str2;
        }
        System.out.println(result);

        */






        /*
        4. write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method

         */

        /*

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String word1 = scan.next();
        System.out.println("Enter last name");
        String word2 = scan.next();

        System.out.println(word1.substring(0,1).toUpperCase() + word2.substring(0,1).toUpperCase());

        */






        /*
        5. write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method

         */

        /*

        String str = "Java";

        String s1 = str.substring(1);
        String s2 = str.substring(0,1);
        System.out.println(s1 + s2);

        // String str1 = str.charAt(3) + "" + str.charAt(2) + str.charAt(1) + str.charAt(0);


        */





        /*
        6. write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
         */

/*

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scan.nextLine();

        int sobaka = email.indexOf('@');
        int tochka = email.indexOf('.');
        String domain = email.substring(sobaka+1, tochka);
        System.out.println(domain);
*/



    }
}