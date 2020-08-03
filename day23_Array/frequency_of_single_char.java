package day23_Array;

import java.util.Scanner;

public class frequency_of_single_char {
    public static void main(String[] args) {

        /*
         write a program that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
         */

        /*
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();

        for(int i = 0; i < str1.length();){
            int count = 0;
            for(int j =i; j < str1.length(); j++){
                if(str1.charAt(i) == str1.charAt(j)){
                    count++;
                }
            }
            System.out.print(""+str1.charAt(i)+count);
            str1 = str1.replace(""+str1.charAt(i),"");
        }

         */

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();

        int j = 0;
        while ((j < str1.length())) {
            int count = 0;
            for(int i =0; i < str1.length(); i++) {
                if(str1.charAt(i) == str1.charAt(j)){
                    count++;
                }
            }
            System.out.print("" + str1.charAt(j) + count);
            str1 = str1.replace("" + str1.charAt(j), "");

        }
    }
}
