package day22_Nested_For_Loop;

import java.util.Scanner;

public class frequency_of_str2 {
    public static void main(String[] args) {

        /*
        Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2
         */


        // 1

        /*
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int count = 0;
        for(int i = 0;i < str1.length();i++){
            for(int j =0;j < str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);

        */



        // 2

        /*

        String str = scan.nextLine();
        char ch = scan.next().charAt(0);

        int count = 0 ; // 1+1 = 2, frequency of ch in str

        for(int i=0; i <= str.length()-1; i++){
                                //ababc
           char each = str.charAt(i);  // a  b a b c

            if( each == ch ){  // if true, means ch is occured in str
                count += 1;
            }

        }

        System.out.println(count);

         */

        // 3

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);

        int count = 0;
        int i = 0;
        while (i<=str.length()-1) {

            char each = str.charAt(i);  // a  b a b c

            if( each == ch ){  // if true, means ch is occured in str
                count += 1;
            }

            i++;

        }

        System.out.println(count);
        }

    }

