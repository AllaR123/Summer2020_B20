package day24_Array_methods;

import java.util.Scanner;

public class Find_unique {
    public static void main(String[] args) {

        /*
        write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
         */

        /*

        String str = "aabccdeeeefffffffjhhhhhhhi";
            // "aabcc"

        String expectedResult = ""; // "b

        for(int j = 0; j <= str.length()-1; j++){ // because we need the frequency of evry single character

            char ch1 = str.charAt(j); // a a b c c
            int count1 = 0; // 1+1  // frequnecy of ch
            for(int i = 0; i <= str.length()-1; i++){  // used for finding the frequnecy of ch and assign it to count
                char each = str.charAt(i);  // a  a  b  c  c
                if(ch1 == each){
                    count1+=1;
                }
            }

            if(count1 == 1 ){ // if it only occured one time
                expectedResult += ch1;
            }

        }

        System.out.println(expectedResult);

*/
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String res = "";


        for (int i = 0; i <str.length(); i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                res+=str.charAt(i);
            }
        }
        System.out.print(res);
    }
}